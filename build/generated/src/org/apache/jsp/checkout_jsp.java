package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import model.Item;
import model.Giohang;
import controller.san_pham_DAO;
import model.Taikhoan;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"shortcut icon\" type=\"img/png\" href=\"img/favicon.png\">\n");
      out.write("  \n");
      out.write("\t<title>Thanh toán</title>\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> <!-- khai báo cho reponsivte -->\n");
      out.write("  <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"reset.css\"> -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\n");
      out.write("  <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"index-reponsive.css\">-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" language=\"javascript\" src=\"javascrip-jquery.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"jquery.elevatezoom.js\"></script>\n");
      out.write("  <style>\n");
      out.write("      #content input{\n");
      out.write("        width: 270px;\n");
      out.write("        height: 30px;\n");
      out.write("        padding-left: 20px;\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 5px 5px 5px 5px;\n");
      out.write("        background: #ccc;\n");
      out.write("      \n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      #content .address{\n");
      out.write("         margin-bottom: 10px;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      #content .account{\n");
      out.write("          margin-bottom: 10px;\n");
      out.write("      }\n");
      out.write("      #content table, tr, th {\n");
      out.write("          border: 1px solid #ccc;\n");
      out.write("      }\n");
      out.write("      #content th{\n");
      out.write("          width: 115px;\n");
      out.write("          height: 35px;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      #content .totalp{\n");
      out.write("          margin-top: 10px;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("  </style>\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            Taikhoan users = (Taikhoan) session.getAttribute("user");
            if(users == null){
              response.sendRedirect("/Lap_trinh_web/dang_nhap.jsp");
          }
              san_pham_DAO spDAO  = new san_pham_DAO();
                    Giohang cart = (Giohang) session.getAttribute("cart");
                    
                    if (cart == null){
                        cart = new Giohang();
//                        
                        session.setAttribute("cart", cart);
                         
                    }
        
      out.write("\n");
      out.write("             \n");
      out.write("    <div id=\"header\">\n");
      out.write("    <div class=\"top-header\">\n");
      out.write("      <ul>\n");
      out.write("          \n");
      out.write("          <li class=\"li_2\">Chào mừng: \n");
      out.write("              ");
if(users !=null){
      out.write("\n");
      out.write("              <span style=\"font-weight: bold; font-size: 16px;\">");
      out.print(users.getUserEmail());
      out.write("</span>\n");
      out.write("              ");
}
      out.write("\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"li_1\">\n");
      out.write("              <button class=\"btn btn-lg btn-success\" id=\"login1\"><a href=\"dang_nhap.jsp\">Đăng nhập</a></button>\n");
      out.write("             \n");
      out.write("          </li>\n");
      out.write("          <li> <button class=\"btn btn-lg btn-success\" id=\"register\"><a href=\"dang_ki.jsp\">Đăng kí</a></button></li>\n");
      out.write("        </ul>\n");
      out.write("    </div> \n");
      out.write("\t\t<div class=\"logo\"><a href=\"#\"><img src=\"img\\logo\\logo.png\"></a></div>\n");
      out.write("\t\t<div class=\"right_header\" >\n");
      out.write("\t\t\t<form action=\"\">\n");
      out.write("\t\t\t<input class=\"inputSearch\" type=\"text\" placeholder=\" Tìm kiếm sản phẩm...\" \n");
      out.write("                                name=\"text_search\">\n");
      out.write("                        <div class=\"resultSearch\" id=\"resultSearch\">\n");
      out.write("\t\t\t\t<h4>Tìm thấy <b></b> Sản phẩm</h4>\n");
      out.write("\t\t\t\t<div class=\"kq\">\n");
      out.write("<!--                                        <a href=\"#\">\n");
      out.write("                                            <img src=\"img/product/pro-1.jpg\" alt=\"\">\n");
      out.write("                                                <span>sản phẩm 1</span>\n");
      out.write("                                                <span>$20</span>\n");
      out.write("                                        </a>-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<button type=\"submit\"><b class=\"fa fa-search\"></b></button>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t<div class=\"right_header_giohang\">\n");
      out.write("\n");
      out.write("\t\t\t\t<form action=\"\">\n");
      out.write("\t\t\t\t\t<img src=\"img\\icon-img\\cart.png\" id=\"gh_open\">\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"showcart\">\n");
      out.write("                                            ");
for(Map.Entry<Long, Item> list: cart.getCartItem().entrySet()){
      out.write("\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("                                                <li>");
      out.print(list.getValue().getSanpham().getTensp());
      out.write(" </li>\n");
      out.write("\t\t\t\t\t\t<li>(x");
      out.print(list.getValue().getSoluong());
      out.write(")</li>\n");
      out.write("                                                <li>:     $");
      out.print(list.getValue().getSanpham().getGiasp());
      out.write("</li>\n");
      out.write("                                                <!--<li><a href=\"Cart_Servlet?command=remove&ID=");
      out.print(list.getValue().getSanpham().getIdsp());
      out.write("\">X</a></li>-->\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("                                                ");

                                                }
                                                
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"totalcost\">Tổng giá : $");
      out.print(cart.TotalCart());
      out.write("</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"button-send\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"close_cart\">Đóng</button>\n");
      out.write("                                                        <a href=\"index.jsp\">Xem giỏ hàng</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        \n");
      out.write("                                        <b>CART: ");
      out.print(cart.CountItem());
      out.write("</b><br>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"Menu\" >\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"checkout.jsp\">Trang Chủ</a></li>\n");
      out.write("        <li><a href=\"checkout.jsp\">Sản Phẩm</a></li>\n");
      out.write("        <li><a href=\"checkout.jsp\">Giỏ Hàng</a></li>\n");
      out.write("        <li><a href=\"checkout.jsp\">Tài Khoản</a></li>\n");
      out.write("        <li><a href=\"\">Tư Vấn</a></li>\n");
      out.write("        <li><a href=\"\">Giới Thiệu</a></li>\n");
      out.write("        <li><a href=\"\">Liên Hệ</a></li>\n");
      out.write("      </ul>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("  <!-- keo len top -->\n");
      out.write("  <div class=\"sec-1\">\n");
      out.write("    <a href=\"javascript:void(0)\" id=\"scrolltop\" class=\"up-top\">\n");
      out.write("    <img src=\"img\\icon-img\\menu.png\"></a>\n");
      out.write("  </div>\n");
      out.write("         <div id=\"content\">\n");
      out.write("            \n");
      out.write("                <form action=\"CheckOutServlet\" method=\"POST\">\n");
      out.write("                    <h2>Chi tiết đơn hàng</h2>\n");
      out.write("                <div>\n");
      out.write("                    <span class=\"word\"> Địa chỉ giao hàng: </span>\n");
      out.write("                    <input type=\"text\" placeholder=\"Nhập địa chỉ...\" name=\"address\">\n");
      out.write("                </div>              \n");
      out.write("                <div>\n");
      out.write("                    <span class=\"word\"> Tên tài khoản: </span>\n");
      out.write("              ");
if(users !=null){
      out.write("\n");
      out.write("                    <span style=\"font-weight: bold; font-size: 16px;\">");
      out.print(users.getUserEmail());
      out.write("</span>\n");
      out.write("              ");
}
      out.write("\n");
      out.write("              ");
for(Map.Entry<Long, Item> list: cart.getCartItem().entrySet()){
      out.write("\n");
      out.write("              <div>\n");
      out.write("                  <span>Tên sản phẩm: ");
      out.print(list.getValue().getSanpham().getTensp());
      out.write(" </span>\n");
      out.write("                  <span>Giá sản phẩm: $");
      out.print(list.getValue().getSanpham().getGiasp());
      out.write("</span>\n");
      out.write("                  <span>Số lượng: ");
      out.print(list.getValue().getSoluong());
      out.write("</span>\n");
      out.write("                  <span>Tổng giá:$");
      out.print(list.getValue().getSoluong() * list.getValue().getSanpham().getGiasp());
      out.write("</span>\n");
      out.write("              </div>\n");
      out.write("              ");
}
      out.write("\n");
      out.write("              <div class=\"totalp\" style=\"font-weight: bold; font-size: 18px;\">\n");
      out.write("                  <span>Tổng tiền:$");
      out.print(cart.TotalCart());
      out.write("</span> \n");
      out.write("              </div>\n");
      out.write("                    \n");
      out.write("              <button class=\"btn btn-lg btn-success\" id=\"button_payment\">\n");
      out.write("                  Xác nhận\n");
      out.write("              </button> \n");
      out.write("            </form>\n");
      out.write("            </div>  \n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
