
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Giohang;
import model.Item;
import model.san_pham;


public class Cart_Servlet extends HttpServlet {
    private final san_pham_DAO dao = new san_pham_DAO();

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
      
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(); // khai báo seesion
        String command = request.getParameter("command"); // lấy thông tin từ thanh địa chỉ( lệnh command mặc định)
        String ID = request.getParameter("ID"); // lấy ID từ thanh địa chỉ
        Giohang cart = (Giohang) session.getAttribute("cart"); // gán ID vừa lấy đc vào giỏ hàng( cart)
        
        try {
            Long idProduct = Long.parseLong(ID); // ép kiểu ID, gán ID = idProduct
            san_pham sanpham = dao.getSP(idProduct); // gán idProduct = id( trong getSP)
            switch(command){
                case "plus": // lấy từ thanh địa chỉ 
                    if(cart.getCartItem().containsKey(idProduct)){
                        cart.AddtoCart(idProduct,
                                new Item(sanpham, cart.getCartItem().get(idProduct).getSoluong()));
                        // gán toàn bộ thông tin giỏ hàng vào cái plus, nếu chưa có thì tạo mơi
                    }else{
                        cart.AddtoCart(idProduct, new Item(sanpham, 1)); // có rồi thì tăng lên 1
//                        response.sendRedirect("/Lap_trinh_web/giohang.jsp");
                    }
                    session.setAttribute("cart", cart);
                    response.sendRedirect("/Lap_trinh_web/danh_sach_san_pham.jsp");
                    break;
                case "pluscart":
                    if(cart.getCartItem().containsKey(idProduct)){
                        cart.AddtoCart(idProduct,
                                new Item(sanpham, cart.getCartItem().get(idProduct).getSoluong()));
                        // gán toàn bộ thông tin giỏ hàng vào cái plus, nếu chưa có thì tạo mơi
                    }else{
                        cart.AddtoCart(idProduct, new Item(sanpham, 1)); // có rồi thì tăng lên 1
//                        response.sendRedirect("/Lap_trinh_web/giohang.jsp");
                    }
                    session.setAttribute("cart", cart);
                    response.sendRedirect("/Lap_trinh_web/giohang.jsp");
                    break;
                case "subitem":
                     if(cart.getCartItem().containsKey(idProduct)){
                        cart.SubtoCart(idProduct,
                                new Item(sanpham, cart.getCartItem().get(idProduct).getSoluong()));
                        
                    }else{
                        cart.SubtoCart(idProduct, new Item(sanpham, 1)); 
                    }
                    session.setAttribute("cart", cart);
                    response.sendRedirect("/Lap_trinh_web/giohang.jsp");
                    break;
                case "remove":
                    cart.EdittoCart(idProduct);
                    session.setAttribute("cart", cart);
                    response.sendRedirect("/Lap_trinh_web/giohang.jsp");
                    break;
                case "delete":  
                    session.invalidate();
                    response.sendRedirect("/Lap_trinh_web/giohang.jsp");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();   
            response.sendRedirect("/Lap_trinh_web/index.jsp");
        }
//        session.setAttribute("cart", cart);
//        response.sendRedirect("/Lap_trinh_web/danh_sach_san_pham.jsp");   
    }
}
