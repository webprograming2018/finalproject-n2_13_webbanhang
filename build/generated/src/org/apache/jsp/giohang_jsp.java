package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import controller.san_pham_DAO;
import model.Giohang;
import java.util.Map;
import model.Item;

public final class giohang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"img/png\" href=\"img/favicon.png\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> <!-- khai báo cho reponsivte -->\n");
      out.write("\t<title>Giỏ hàng</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/giohang.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"css\\bootstrap.min.css\">-->\n");
      out.write("        <script src=\"jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"css\\bootstrap.min.js\"></script> \n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"javascrip-jquery.js\"></script>\n");
      out.write("        <!--<script type=\"text/javascript\" language=\"javascript\" src=\"javascrip-jquery.js\"></script>--> \n");
      out.write("        <script type=\"text/javascript\" src=\"jquery.elevatezoom.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("               \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("         ");

                    san_pham_DAO spDAO  = new san_pham_DAO();
                    Giohang cart = (Giohang) session.getAttribute("cart");
                    
                    if (cart == null){
                        cart = new Giohang();
//                        
                        session.setAttribute("cart", cart);
                         
                    }
                    ArrayList<Double> arrayList = new ArrayList<Double>();
                
      out.write("\n");
      out.write("            <div id=\"content\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <table class=\"table table-bordered\" id=\"table-products\">\n");
      out.write("                <thead>\n");
      out.write("                   <tr>\n");
      out.write("                    \t<th>Hình ảnh</th>\n");
      out.write("                        <th>Tên sản phẩm</th>\n");
      out.write("                        <th>Giá sản phẩm</th>\n");
      out.write("                        <th>Số lượng</th>\n");
      out.write("                        <th>Tổng giá</th>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                    <tr></tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                     ");
for(Map.Entry<Long, Item> list: cart.getCartItem().entrySet()){
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><img src=\"");
      out.print(list.getValue().getSanpham().getAnhsp());
      out.write("\"></td>\n");
      out.write("                        <td>");
      out.print(list.getValue().getSanpham().getTensp());
      out.write(" </td>\n");
      out.write("                        <td>$");
      out.print(list.getValue().getSanpham().getGiasp());
      out.write("</td>\n");
      out.write("                        <td class=\"display_soluong\">\n");
      out.write("                            <a href=\"Cart_Servlet?command=subitem&ID=");
      out.print(list.getValue().getSanpham().getIdsp());
      out.write("\">Trừ</a>\n");
      out.write("                            <input name=\"text\" value=\"");
      out.print(list.getValue().getSoluong());
      out.write("\">\n");
      out.write("                            <a href=\"Cart_Servlet?command=pluscart&ID=");
      out.print(list.getValue().getSanpham().getIdsp());
      out.write("\">Thêm</a>\n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                        <td>$");
      out.print(list.getValue().getSoluong() * list.getValue().getSanpham().getGiasp());
      out.write("\n");
      out.write("                        <span class=\"span_xoa\"><a href=\"Cart_Servlet?command=remove&ID=");
      out.print(list.getValue().getSanpham().getIdsp());
      out.write("\">XÓA</a></span>\n");
      out.write("                        \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"4\">Tổng tiền thanh toán</td>\n");
      out.write("                        <td>$");
      out.print(cart.TotalCart());
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <button class=\"btn btn-lg btn-success\" id=\"button_paypal\">\n");
      out.write("                <a href=\"paypal.jsp\" id=\"btn_funtion\">Thanh toán paypal</a>\n");
      out.write("            </button>\n");
      out.write("            <button class=\"btn btn-lg btn-success\" id=\"button_payment\">Thanh toán tại nhà</button>\n");
      out.write("            <button class=\"btn btn-lg btn-success\" id=\"button_huy\">\n");
      out.write("                <a href=\"\" id=\"btn_funtion\">Hủy hóa đơn</a>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("       \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
