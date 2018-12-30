package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Giohang;
import model.san_pham;
import controller.san_pham_DAO;

public final class danh_005fsach_005fsan_005fpham_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"img/png\" href=\"img/favicon.png\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> <!-- khai báo cho reponsivte -->\n");
      out.write("\t<title>Danh sách sản phẩm</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/danh_sach.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"css\\bootstrap.min.css\">-->\n");
      out.write("        <script src=\"jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"css\\bootstrap.min.js\"></script> \n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"javascrip-jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"javascrip-jquery.js\"></script> \n");
      out.write("        <script type=\"text/javascript\" src=\"jquery.elevatezoom.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("                ");

                    san_pham_DAO spDAO  = new san_pham_DAO();  // gọi class
                   
                    Giohang cart = (Giohang) session.getAttribute("cart"); // khai báo giỏ hàng( key = cart)
                    if (cart == null){ 
                        cart = new Giohang();
                        session.setAttribute("cart", cart);
                    }
                          
                
      out.write("\n");
      out.write("        <div id=\"content\">\n");
      out.write("\t\t<div class=\"breadcrumb\">\n");
      out.write("\t\t\t<a href=\"#\">Trang chủ</a>\n");
      out.write("\t\t\t<span class=\"label\"> > </span>\n");
      out.write("\t\t\t<span style=\"color: #ff5313\">Danh sách sản phẩm</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"main-left-list\">\n");
      out.write("\t\t\t<div class=\"search-product\">\n");
      out.write("\t\t\t\t<p class=\"tieu-de\">Tìm sản phẩm</p>\n");
      out.write("\t\t\t\t<form action=\"\" class=\"frm-3\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"tim-kiem\" placeholder=\"Tìm sản phẩm...\">\n");
      out.write("\t\t\t\t\t<button class=\"btn-tim-kiem\"></button>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"filter\">\n");
      out.write("\t\t\t\t<p class=\"tieu-de\">Lọc theo giá</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"category\">\n");
      out.write("\t\t\t\t<p class=\"tieu-de\">Thể loại</p>\n");
      out.write("\t\t\t\t<div class=\"noi_dung\">\n");
      out.write("\t\t\t\t\t<p class=\"noi-dung-2\">\n");
      out.write("\t\t\t\t\t\t<span class=\"ten\"><a class=\"t_l\" href=\"\">Ghế dài</a></span></p>\n");
      out.write("\t\t\t\t\t<p class=\"noi-dung-2\">\n");
      out.write("\t\t\t\t\t\t<span class=\"ten\"><a class=\"t_l\" href=\"\">Salon</a></span></p>\n");
      out.write("\t\t\t\t\t<p class=\"noi-dung-2\">\n");
      out.write("\t\t\t\t\t\t<span class=\"ten\"><a class=\"t_l\" href=\"\">Ghế thấp</a></span></p>\n");
      out.write("\t\t\t\t\t<p class=\"noi-dung-2\">\n");
      out.write("\t\t\t\t\t\t<span class=\"ten\"><a class=\"t_l\" href=\"\">Ghế cao</a></span></p>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t<div class=\"size-4\">\n");
      out.write("\t\t\t\t<p class=\"tieu-de\">Kích cỡ</p>\n");
      out.write("\t\t\t\t<div class=\"main\">\n");
      out.write("\t\t\t\t\t<p class=\"noi-dung-2\"><span class=\"ten-1\"><a class=\"t_l_1\" href=\"\">S</a></span></p>\n");
      out.write("\t\t\t\t\t<p class=\"noi-dung-2\"><span class=\"ten-1\"><a class=\"t_l_1\" href=\"\">M</a></span></p>\n");
      out.write("\t\t\t\t\t<p class=\"noi-dung-2\"><span class=\"ten-1\"><a class=\"t_l_1\" href=\"\">L</a></span></p>\n");
      out.write("\t\t\t\t\t<p class=\"noi-dung-2\"><span class=\"ten-1\"><a class=\"t_l_1\" href=\"\">XL</a></span></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"tag\">\n");
      out.write("\t\t\t\t<p class=\"tieu-de\">Quảng cáo</p>\n");
      out.write("\t\t\t\t<p class=\"tag-1\" id=\"can-dong\"><span class=\"size-1\">asian </span><span class=\"size-2\">brown </span><span class=\"size-3\">euro fashion</span></p>\n");
      out.write("\t\t\t\t<p class=\"tag-1\"><span class=\"size-1\">france </span><span class=\"size-2\">hat </span><span class=\"size-3\">t-shirt </span><span class=\"size-2\">teen</span></p>\n");
      out.write("\t\t\t\t<p class=\"tag-1\"><span class=\"size-2\">travel </span><span class=\"size-2\">white</span></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"banner-1\">\n");
      out.write("\t\t\t\t<img src=\"img/banner/banner-10.png\" alt=\"Banner 1\" width=\"270px\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("                   \n");
      out.write("\t\t<div class=\"main-right-list\">\n");
      out.write("                    ");

                        for(san_pham p: spDAO.getlistSP()){
                    
      out.write("\n");
      out.write("\t\t\t<div class=\"san-pham-5\" >\n");
      out.write("\t\t\t<div id=\"anhto-1\" class=\"anhto\">\n");
      out.write("\t\t\t<a href=\"chi_tiet_1sp.jsp?ID=");
      out.print(p.getIdsp());
      out.write("\">\n");
      out.write("\t\t\t<img src=\"");
      out.print(p.getAnhsp());
      out.write("\" alt=\"Chi tiết sản phẩm\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"noidung-1\" class=\"noi-dung\">\n");
      out.write("\t\t\t\t<p class=\"title\">");
      out.print(p.getTensp());
      out.write("</p>\n");
      out.write("\t\t\t\t<span class=\"gia-tien\" style=\"font-size: 20px;\">$");
      out.print(p.getGiasp());
      out.write("</span>\n");
      out.write("\t\t\t\t<div class=\"mo-ta-3\">Lorem ipsum dolor sit amet, \n");
      out.write("                                    consectetur adipisicing elit. Sunt eos temporibus aspernatur \n");
      out.write("                                    quasi vel, velit error quae, exercitationem quia facilis, \n");
      out.write("                                    mollitia quas explicabo. Voluptate sed excepturi, \n");
      out.write("                                    at voluptatibus eaque corporis.</div>\n");
      out.write("                                <button class=\"add-cart-1\"><a href=\"Cart_Servlet?command=plus&ID=");
      out.print(p.getIdsp());
      out.write("\">Thêm giỏ hàng</a></button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"brand-logo\">\n");
      out.write("\t\t\t<div class=\"anh-5\">\n");
      out.write("\t\t\t\t<img src=\"img/brand-logo/brand-4.png\" alt=\"barnd\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"anh-5\">\n");
      out.write("\t\t\t\t<img src=\"img/brand-logo/brand-1.png\" alt=\"barnd\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"anh-5\">\n");
      out.write("\t\t\t\t<img src=\"img/brand-logo/brand-2.png\" alt=\"barnd\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"anh-5\">\n");
      out.write("\t\t\t\t<img src=\"img/brand-logo/brand-3.png\" alt=\"barnd\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"anh-5\">\n");
      out.write("\t\t\t\t<img src=\"img/brand-logo/brand-4.png\" alt=\"barnd\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        \n");
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
