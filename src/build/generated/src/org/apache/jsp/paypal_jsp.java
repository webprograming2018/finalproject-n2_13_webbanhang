package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.san_pham_DAO;
import model.Giohang;

public final class paypal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

             san_pham_DAO spDAO  = new san_pham_DAO();
          Giohang cart = (Giohang) session.getAttribute("cart");
                    if (cart == null){
                        cart = new Giohang();
                        session.setAttribute("cart", cart);
                    }
        
      out.write("\n");
      out.write("                <div id=\"paypal-button\"></div>\n");
      out.write("<script src=\"https://www.paypalobjects.com/api/checkout.js\"></script>\n");
      out.write("<script>\n");
      out.write("    paypal.Button.render({\n");
      out.write("    // Configure environment\n");
      out.write("    env: 'sandbox',\n");
      out.write("    client: {\n");
      out.write("      sandbox: 'AfTdeg2kTjXDP5Q21GWXGubsk_Skqx5dGl98HUfzJJZPQhG7Ln_jsI20aYMwjGJ4GxNNSDy9KRdy0bf-',\n");
      out.write("      production: 'AVmuDn1A1q9ps5x870AR3T92HUmOGajqoz9osXqpUNrXnuGXCIUaSpFL1pBem-dKS8WMROa7AKR0JF2b'\n");
      out.write("    },\n");
      out.write("    // Customize button (optional)\n");
      out.write("    locale: 'en_US',\n");
      out.write("    style: {\n");
      out.write("      size: 'small',\n");
      out.write("      color: 'gold',\n");
      out.write("      shape: 'pill',\n");
      out.write("    },\n");
      out.write("     Thiết lập thanh toán tổng quát\n");
      out.write("        payment: function(data, actions) {\n");
      out.write("        return actions.payment.create({\n");
      out.write("        transactions: [{\n");
      out.write("          amount: {\n");
      out.write("            total: '");
      out.print(cart.TotalCart());
      out.write("',\n");
      out.write("            currency: 'USD'\n");
      out.write("          },\n");
      out.write("          description: 'The payment transaction description.' // giỏ hàng\n");
      out.write("        }]\n");
      out.write("      });\n");
      out.write("    },  \n");
      out.write("    // Thiết lập thanh toán chi tiết\n");
      out.write("//    payment: function(data, actions) {\n");
      out.write("//  return actions.payment.create({\n");
      out.write("//    transactions: [{\n");
      out.write("//      amount: {\n");
      out.write("//        total: '30.11',\n");
      out.write("//        currency: 'USD',\n");
      out.write("//        details: {\n");
      out.write("//          subtotal: '30.00',\n");
      out.write("//          tax: '0.07',\n");
      out.write("//          shipping: '0.03',\n");
      out.write("//          handling_fee: '1.00',\n");
      out.write("//          shipping_discount: '-1.00',\n");
      out.write("//          insurance: '0.01'\n");
      out.write("//        }\n");
      out.write("//      },\n");
      out.write("//      description: 'The payment transaction description.',\n");
      out.write("//      custom: '90048630024435',\n");
      out.write("//      //invoice_number: '12345', Insert a unique invoice number\n");
      out.write("//      payment_options: {\n");
      out.write("//        allowed_payment_method: 'INSTANT_FUNDING_SOURCE'\n");
      out.write("//      },\n");
      out.write("//      soft_descriptor: 'ECHI5786786',\n");
      out.write("//      item_list: {\n");
      out.write("//        items: [\n");
      out.write("//        {\n");
      out.write("//          name: 'hat',\n");
      out.write("//          description: 'Brown hat.',\n");
      out.write("//          quantity: '5',\n");
      out.write("//          price: '3',\n");
      out.write("//          tax: '0.01',\n");
      out.write("//          sku: '1',\n");
      out.write("//          currency: 'USD'\n");
      out.write("//        },\n");
      out.write("//        {\n");
      out.write("//          name: 'handbag',\n");
      out.write("//          description: 'Black handbag.',\n");
      out.write("//          quantity: '1',\n");
      out.write("//          price: '15',\n");
      out.write("//          tax: '0.02',\n");
      out.write("//          sku: 'product34',\n");
      out.write("//          currency: 'USD'\n");
      out.write("//        }]\n");
      out.write("//        \n");
      out.write("//      }\n");
      out.write("//    }],\n");
      out.write("//    note_to_payer: 'Contact us for any questions on your order.'\n");
      out.write("//  });\n");
      out.write("//},\n");
      out.write("    // Thực hiện thanh toán\n");
      out.write("    onAuthorize: function(data, actions) {\n");
      out.write("      return actions.payment.execute().then(function() {\n");
      out.write("        // Show a confirmation message to the buyer\n");
      out.write("        window.alert('Tổng số tiền bạn đã thanh toán là : $'+ ");
      out.print(cart.TotalCart());
      out.write(");\n");
      out.write("      });\n");
      out.write("    }\n");
      out.write("  }, '#paypal-button');\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<a href=\"index.jsp\">Quay về trang chủ</a>\n");
      out.write("    \n");
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
