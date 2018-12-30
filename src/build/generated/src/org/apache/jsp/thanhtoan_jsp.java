package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class thanhtoan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam['posturl']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"POST\">\n");
      out.write("            <input type=\"hidden\" name =\"upload\" value=\"1\"/>\n");
      out.write("            <input type=\"hidden\" name =\"return\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam['returnurl']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name =\"cmd\" value=\"_cart\"/>\n");
      out.write("            <input type=\"hidden\" name =\"business\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam['business']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            <!--san pham 1-->\n");
      out.write("            ");
  int a =0;
        String[] s = new String[100] ;
        String[] c = new String[100];
        String[] b= new String[100];
        String[] d= new String[100];
        for(int i=1; i<=4; i++){
            a++;
            s[i] = "item" +"_"+"name"+"_"+a;
            c[i] = "amount"+"_"+a;
            b[i] = "quantity"+"_"+a;
            d[i] = "sanpham"+a;
        
            
      out.write("\n");
      out.write("            <input type=\"hidden\" name =\"");
      out.print(s[i]);
      out.write("\" value=\"");
      out.print(d[i]);
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name =\"");
      out.print(c[i]);
      out.write("\" value=\"10\"/>\n");
      out.write("            <input type=\"hidden\" name =\"");
      out.print(b[i]);
      out.write("\" value=\"2\"/>\n");
      out.write("      \n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <span>san pham 1// gia: 10 // so luong: 2</span>\n");
      out.write("            <span>san pham2// gia: 20 // so luong: 4</span>\n");
      out.write("            <span> tong gia: 100</span>\n");
      out.write("           <button class=\"btn btn-lg btn-success\" id=\"button_paypal\">\n");
      out.write("              Thanh toán paypal\n");
      out.write("            </button>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
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
