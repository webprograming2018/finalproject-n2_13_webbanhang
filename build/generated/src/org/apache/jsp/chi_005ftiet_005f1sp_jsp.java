package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.san_pham_DAO;
import model.san_pham;

public final class chi_005ftiet_005f1sp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"img/png\" href=\"img/favicon.png\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> <!-- khai báo cho reponsivte -->\n");
      out.write("\t<title>Chi tiết 1 sản phẩm</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/chi_tiet_sp_1.css\">\n");
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
      out.write("        ");

            san_pham_DAO proDAO = new san_pham_DAO();
            san_pham sp = new san_pham();
            String productID = "";
            if(request.getParameter("ID")!=null){
                productID = request.getParameter("ID");
                sp = proDAO.getSP(Long.parseLong(productID));
            }
        
      out.write("\n");
      out.write("        <div id=\"content\">\n");
      out.write("\t\t<div class=\"breadcrumb\">\n");
      out.write("\t\t\t<a href=\"#\">Trang chủ</a>\n");
      out.write("\t\t\t<span class=\"label\">></span>\n");
      out.write("\t\t\t<span style=\"color: #ff5313\">Chi tiết sản phẩm</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"product-info\">\n");
      out.write("\t\t\t<div class=\"left-info-product\">\n");
      out.write("\t\t\t\t<div class=\"anh-to\">\n");
      out.write("\t\t\t\t\t<img id=\"zoom_01\" src=\"img/product-details/product-detalis-l1.jpg\" data-zoom-image=\"img/product-details/product-detalis-lag1.jpg\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"anh-nho\">\n");
      out.write("\t\t\t\t\t<img src=\"img/product-details/product-detalis-s1.jpg\" alt=\"Chi tiết sản phẩm\">\n");
      out.write("\t\t\t\t\t<img src=\"img/product-details/product-detalis-s2.jpg\" alt=\"Chi tiết sản phẩm\">\n");
      out.write("\t\t\t\t\t<img src=\"img/product-details/product-detalis-s3.jpg\" alt=\"Chi tiết sản phẩm\">\n");
      out.write("\t\t\t\t\t<img src=\"img/product-details/product-detalis-s4.jpg\" alt=\"Chi tiết sản phẩm\">\n");
      out.write("\t\t\t\t\t<img src=\"img/product-details/product-detalis-s4.jpg\" alt=\"Chi tiết sản phẩm\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"right-info-product\">\n");
      out.write("                            <p class=\"title\">");
      out.print(sp.getTensp());
      out.write("</p>\n");
      out.write("\t\t\t\t<span class=\"gia-cu-1\">$162.00</span>\n");
      out.write("\t\t\t\t<span class=\"gia-moi\">");
      out.print(sp.getGiasp());
      out.write("</span>\n");
      out.write("\t\t\t\t<p class=\"mo-ta-1\">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>\n");
      out.write("\t\t\t\t<p class=\"size\">Kích cỡ:</p>\n");
      out.write("\t\t\t\t<select>\n");
      out.write("  \t\t\t\t\t<option value=\"S\">S</option>\n");
      out.write("  \t\t\t\t\t<option value=\"S\">M</option>\n");
      out.write("  \t\t\t\t\t<option value=\"S\">L</option>\n");
      out.write("  \t\t\t\t\t<option value=\"S\">XL</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t\t<p class=\"color\">Màu sắc:</p>\n");
      out.write("\t\t\t\t<div class=\"wrap-mau\">\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<button id=\"cat_color0\" value=\"img/product-details/product-detalis-l1.jpg\">\n");
      out.write("\t\t\t\t\t\t<span class=\"mau\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t<button id=\"cat_color1\" style=\"background-color: red\" \n");
      out.write("\t\t\t\tvalue=\"img\\product-details\\doimau\\red.jpg\"\n");
      out.write("\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t<span class=\"mau\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<button id=\"cat_color2\" style=\"background-color: violet\" \n");
      out.write("\t\t\t\t\tvalue=\"img\\product-details\\doimau\\violet.jpg\">\n");
      out.write("\t\t\t\t\t\t<span class=\"mau\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<button id=\"cat_color3\" style=\"background-color: green\" value=\"img\\product-details\\doimau\\green.jpg\"><span class=\"mau\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<form action=\"\" class=\"frm-2\">\n");
      out.write("\t\t\t\t\t<button class=\"giam\">-</button>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"so-luong\" placeholder=\"02\">\n");
      out.write("\t\t\t\t\t<button class=\"tang\">+</button>\n");
      out.write("\t\t\t\t\t<button class=\"add-cart\">Thêm giỏ hàng</button>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t<p class=\"categories\">Thể loại:</p>\n");
      out.write("\t\t\t\t<p class=\"detail\">Ghế đơn, Ghế da</p>\n");
      out.write("\t\t\t\t<p class=\"share\">Chia sẻ:</p>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"product-detail\">\n");
      out.write("\t\t\t<div class=\"tab-detail\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"describe\">MIÊU TẢ CHI TIẾT</li>\n");
      out.write("\t\t\t\t\t<li class=\"imfomation\">THÊM THÔNG TIN</li>\n");
      out.write("\t\t\t\t\t<li class=\"feedback\">Ý KIẾN PHẢN HỒI</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<p class=\"mieuta\">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n");
      out.write("\t\t\tLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n");
      out.write("\t\t\tLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n");
      out.write("\t\t\tLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\tLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\tLorem Ipsum is simply dummy text of the printing and typesetting industry<br>\n");
      out.write("\t\t\tLorem Ipsum is simply dummy text of the printing and typesetting industry<br>\n");
      out.write("\t\t\tLorem Ipsum is simply dummy text of the printing and typesetting industry<br>\n");
      out.write("\t\t\tLorem Ipsum is simply dummy text of the printing and typesetting industry<br>\n");
      out.write("\t\t\tLorem Ipsum is simply dummy text of the printing and typesetting industry\n");
      out.write("\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<p class=\"thongtin\">\n");
      out.write("\t\t\t\tĐỗ Anh Tú\n");
      out.write("\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<p class=\"phanhoi\">\n");
      out.write("\t\t\t\tĐỗ Anh Tú & những người bạn\n");
      out.write("\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"product-relate\">\n");
      out.write("\t\t\t<p class=\"title-1\">SẢN PHẨM LIÊN QUAN</p>\n");
      out.write("\t\t\t<div class=\"san-pham-4\">\n");
      out.write("\t\t\t\t<div class=\"anh-6\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img src=\"img/product/pro-3.jpg\" alt=\"San pham 4\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"noi-dung-1\">\n");
      out.write("\t\t\t\t\t<p class=\"ten-san-pham-2\">Ornare consequat</p>\n");
      out.write("\t\t\t\t\t<span class=\"gia-cu\">$120.00 </span>\n");
      out.write("\t\t\t\t\t<span class=\"gia-tien-1\">$120.00 </span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"san-pham-4\">\n");
      out.write("\t\t\t\t<div class=\"anh-6\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img src=\"img/product/pro-4.jpg\" alt=\"San pham 4\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"noi-dung-1\">\n");
      out.write("\t\t\t\t\t<p class=\"ten-san-pham-2\">Ornare consequat</p>\n");
      out.write("\t\t\t\t\t<span class=\"gia-tien-1\">$120.00 </span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"san-pham-4\">\n");
      out.write("\t\t\t\t<div class=\"anh-6\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img src=\"img/product/pro-5.jpg\" alt=\"San pham 4\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"noi-dung-1\">\n");
      out.write("\t\t\t\t\t<p class=\"ten-san-pham-2\">Ornare consequat</p>\n");
      out.write("\t\t\t\t\t<span class=\"gia-cu\">$120.00 </span>\n");
      out.write("\t\t\t\t\t<span class=\"gia-tien-1\">$120.00 </span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\t\t\n");
      out.write("\t</div>\n");
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
