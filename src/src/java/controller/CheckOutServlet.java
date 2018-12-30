
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Giohang;
import model.Hoadon;
import model.Hoadon_detail;
import model.Item;
import model.Taikhoan;

/**
 *
 * @author Dell
 */
public class CheckOutServlet extends HttpServlet {
    private final BillDAO billdao = new BillDAO();
    private final BilldetailDAO bddao = new BilldetailDAO();

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String address = request.getParameter("address");
        HttpSession session = request.getSession();
        Giohang cart = (Giohang) session.getAttribute("cart");
        Taikhoan user = (Taikhoan) session.getAttribute("user");
        try {
            // Insert giỏ hàng vào db
            long ID = new Date().getTime();
            Hoadon bill = new Hoadon();
             Calendar cal = Calendar.getInstance();
                Date t = cal.getTime();
		SimpleDateFormat dfc = new SimpleDateFormat("dd/MM/yyyy");
		String s = dfc.format(t);
            bill.setIDbill(ID);
            bill.setAddress(address);
            bill.setIDuser(user.getUserID());
            bill.setPayment(user.getUserEmail());
            bill.setDate(new Timestamp(new Date().getTime()));
            bill.setTotalcart(cart.TotalCart());
            billdao.addBill(bill);
            for(Map.Entry<Long, Item> list: cart.getCartItem().entrySet()){
                bddao.addBilldetail(
                        new Hoadon_detail(ID,list.getValue().getSanpham().getIdsp(),
                                list.getValue().getSanpham().getGiasp(),
                                list.getValue().getSoluong(),s));
            }
            cart = new Giohang();
            session.setAttribute("cart",cart);
        } catch (Exception e) {
        }
        response.sendRedirect("/Lap_trinh_web/index.jsp");
        
    }

   

}
