package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paypal_005ftest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://www.paypalobjects.com/api/checkout.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            paypal.Button.render({\n");
      out.write("  env: 'production', // Optional: specify 'sandbox' environment\n");
      out.write("  client: {\n");
      out.write("    sandbox:'AfTdeg2kTjXDP5Q21GWXGubsk_Skqx5dGl98HUfzJJZPQhG7Ln_jsI20aYMwjGJ4GxNNSDy9KRdy0bf-',\n");
      out.write("    production: 'AVmuDn1A1q9ps5x870AR3T92HUmOGajqoz9osXqpUNrXnuGXCIUaSpFL1pBem-'\n");
      out.write("  },\n");
      out.write("  commit: true, // Optional: show a 'Pay Now' button in the checkout flow\n");
      out.write("  payment: function (data, actions) {\n");
      out.write("    return actions.payment.create({\n");
      out.write("      payment: {\n");
      out.write("        transactions: [\n");
      out.write("          {\n");
      out.write("            amount: {\n");
      out.write("              total: '1.00',\n");
      out.write("              currency: 'USD'\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("        ]\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  },\n");
      out.write("  onAuthorize: function (data, actions) {\n");
      out.write("    // Get the payment details\n");
      out.write("    return actions.payment.get()\n");
      out.write("      .then(function (paymentDetails) {\n");
      out.write("        // Show a confirmation using the details from paymentDetails\n");
      out.write("        // Then listen for a click on your confirm button\n");
      out.write("        document.querySelector('#confirm-button')\n");
      out.write("          .addEventListener('click', function () {\n");
      out.write("            // Execute the payment\n");
      out.write("            return actions.payment.execute()\n");
      out.write("              .then(function () {\n");
      out.write("                // Show a success page to the buyer\n");
      out.write("              });\n");
      out.write("          });\n");
      out.write("      });\n");
      out.write("  }\n");
      out.write("}, '#paypal-button');\n");
      out.write("        </script>\n");
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
