package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dang_005fnhap_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("          <link rel=\"shortcut icon\" type=\"img/png\" href=\"img/favicon.png\">\n");
      out.write("  \n");
      out.write("\t<title>Đăng nhập</title>\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> <!-- khai báo cho reponsivte -->\n");
      out.write("  <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"reset.css\"> -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/dang_ki.css\">\n");
      out.write("  <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"index-reponsive.css\">-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" language=\"javascript\" src=\"javascrip-jquery.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"jquery.elevatezoom.js\"></script>\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <div id=\"dangki\">\n");
      out.write("                <form action=\"Dangki_Servelet\" method=\"POST\">\n");
      out.write("                ");
 if(request.getParameter("error")!=null){
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <p style=\"color: red\">");
      out.print(request.getParameter("error"));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <span class=\"word\"> Username: </span>\n");
      out.write("                    <input type=\"text\" placeholder=\"Nhập tên tài khoản...\" id=\"email\" name=\"email\">\n");
      out.write("                </div>              \n");
      out.write("                <div>\n");
      out.write("                    <span class=\"word\"> Password: </span>\n");
      out.write("                    <input type=\"password\" placeholder=\"Nhập mật khẩu...\" id=\"pass\" name=\"pass\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                    <input type=\"hidden\" value=\"login\" name=\"command\">\n");
      out.write("                    <input type=\"submit\" value=\"Đăng nhập\" id=\"click_login\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
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
