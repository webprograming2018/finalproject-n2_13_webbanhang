package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.ChartMonthDAO;
import model.ValueMonth;
import java.util.Map;

public final class chartMonth_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

            String thang= (String) session.getAttribute("month");
            Map<String,ValueMonth> mapTS = new ChartMonthDAO().thongKeTheoThang(thang);		
        
      out.write("\n");
      out.write("        <form action=\"ChartMonthServlet\" method=\"POST\">\n");
      out.write("            <input type=\"month\" name=\"month\">\n");
      out.write("            <input type=\"submit\" name=\"Gui\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \t<table id=\"datatable-buttons\" class=\"table table-striped table-bordered\">\n");
      out.write("                      <thead>\n");
      out.write("                        <tr>\n");
      out.write("                          <th>STT</th>\n");
      out.write("                          <th>Tên sp</th>\n");
      out.write("                          <th>Chi so</th>\n");
      out.write("                        </tr>\n");
      out.write("                      </thead>\n");
      out.write("                      <tbody>\n");
      out.write("                      ");
int count=0;for(ValueMonth ts : mapTS.values()){ count++;
      out.write("\n");
      out.write("           \t\t\t\t <TR>\n");
      out.write("               \t\t\t\t <TD> ");
      out.print( count);
      out.write("</td>\n");
      out.write("               \t\t\t\t <TD> ");
      out.print( ts.getTen());
      out.write("</TD>\n");
      out.write("              \t\t\t\t  <TD> ");
      out.print( ts.getChiso() );
      out.write("</TD>\n");
      out.write("           \t\t\t\t </TR>\n");
      out.write("           \t\t\t\t ");
} 
      out.write("\n");
      out.write("                      </tbody>\n");
      out.write("                    </table>\n");
      out.write("        </div>\n");
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
