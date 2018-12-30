package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Item;
import java.util.Map;
import model.Giohang;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

          Giohang cart = (Giohang) session.getAttribute("cart");
                    if (cart == null){
                        cart = new Giohang();
                        session.setAttribute("cart", cart);
                    }
        
      out.write("\n");
      out.write("    <div id=\"header\">\n");
      out.write("    <div class=\"top-header\">\n");
      out.write("      <ul>\n");
      out.write("          <li>Mời đăng nhập vào hệ thống</li>\n");
      out.write("          <li class=\"li_2\">Điện thoại hộ trợ: <span style=\"font-weight: bold; font-size: 18px;\">84-8888 8888</span>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"li_3\">\n");
      out.write("            <label for=\"font\">Font chữ</label>\n");
      out.write("            <select name=\"font\" id=\"font\">\n");
      out.write("              <option value=\"Time New Roman\">Time New Roman</option>\n");
      out.write("              <option value=\"Arial\" selected>Arial</option>\n");
      out.write("            </select>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"li_4\">\n");
      out.write("            <label for=\"color\">Màu sắc</label>\n");
      out.write("            <select name=\"color\" id = \"color\">\n");
      out.write("              <option value=\"black\">Black</option>\n");
      out.write("              <option value=\"orange\">Orange</option>\n");
      out.write("            </select>\n");
      out.write("          </li>\n");
      out.write("<!--          <li>\n");
      out.write("            <input type=\"submit\" name=\"txt_log\" class= \"log\" value=\"Đăng nhập\" >\n");
      out.write("            <input type=\"submit\" name=\"txt_reg\" class=\"reset\" value=\"Nhập lại\">\n");
      out.write("          </li>-->\n");
      out.write("        </ul>\n");
      out.write("    </div> \n");
      out.write("\t\t<div class=\"logo\"><a href=\"#\"><img src=\"img\\logo\\logo.png\"></a></div>\n");
      out.write("\t\t<div class=\"right_header\" >\n");
      out.write("\t\t\t<form action=\"\">\n");
      out.write("\t\t\t<input type=\"text\" name=\"txt_search\" placeholder=\"Tìm kiếm sản phẩm...\">\n");
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
      out.write("                                                    <li>");
      out.print(list.getValue().getSanpham().getTensp());
      out.write(" </li>\n");
      out.write("\t\t\t\t\t\t<li>(x");
      out.print(list.getValue().getSoluong());
      out.write(")</li>\n");
      out.write("                                                <li>:     $");
      out.print(list.getValue().getSanpham().getGiasp());
      out.write("</li>\n");
      out.write("                                                <li><a href=\"Cart_Servlet?command=remove&ID=");
      out.print(list.getValue().getSanpham().getIdsp());
      out.write("\">X</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("                                                ");

                                                }
                                                
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"totalcost\">Tổng giá : $");
      out.print(cart.TotalCart());
      out.write("</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"button-send\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"close_cart\">Đóng</button>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\">Thanh toán</a>\n");
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
      out.write("        <li><a href=\"index.jsp\">Trang Chủ</a></li>\n");
      out.write("        <li><a href=\"danh_sach_san_pham.jsp\">Sản Phẩm</a></li>\n");
      out.write("        <li><a href=\"\">Giỏ Hàng</a></li>\n");
      out.write("        <li><a href=\"dang_ki_tai_khoan.html\">Tài Khoản</a></li>\n");
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
