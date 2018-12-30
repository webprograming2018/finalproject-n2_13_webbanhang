<%-- 
    Document   : paypal
    Created on : Nov 13, 2018, 9:13:04 PM
    Author     : Dell
--%>


<%@page import="model.Taikhoan"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page import="controller.san_pham_DAO"%>
<%@page import="model.Giohang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
              Taikhoan users = (Taikhoan) session.getAttribute("user");
            if(users == null){
              response.sendRedirect("/Lap_trinh_web/dang_nhap.jsp");
          }
             san_pham_DAO spDAO  = new san_pham_DAO();
             
                Giohang cart = (Giohang) session.getAttribute("cart");
                    if (cart == null){
                        cart = new Giohang();
                        session.setAttribute("cart", cart);
                    }
//           session.invalidate();
        %>
       
                <div id="paypal-button"></div>
<script src="https://www.paypalobjects.com/api/checkout.js"></script>
<script>
    paypal.Button.render({
    // Configure environment
    env: 'sandbox',
    client: {
      sandbox: 'AfTdeg2kTjXDP5Q21GWXGubsk_Skqx5dGl98HUfzJJZPQhG7Ln_jsI20aYMwjGJ4GxNNSDy9KRdy0bf-',
      production: 'AVmuDn1A1q9ps5x870AR3T92HUmOGajqoz9osXqpUNrXnuGXCIUaSpFL1pBem-dKS8WMROa7AKR0JF2b'
    },
    // Customize button (optional)
    locale: 'en_US',
    style: {
      size: 'small',
      color: 'gold',
      shape: 'pill'
    },
//     Thiết lập thanh toán tổng quát
//        payment: function(data, actions) {
//        
//        return actions.payment.create({
//        transactions: [{
//          amount: {
//            total: '160.13',
//            currency: 'USD',
//            details: {
//                   subtotal: '<%=cart.TotalCart()%>',
//                   
//                    tax: '0.07',
//                    shipping: '0.03',
//                    handling_fee: '1.00',
//                    shipping_discount: '-1.00',
//                    insurance: '0.01'
//        }
//          },
//          description: 'The payment transaction description.' // giỏ hàng
////          custom: '90048630024435'
//        }]
//      });
//    },  
    // Thiết lập thanh toán chi tiết
    payment: function(data, actions) {
    return actions.payment.create({
    transactions: [{
      amount: {
        total: '<%=cart.TotalCart()%>',
        currency: 'USD',
        details: {
          subtotal: '<%=cart.TotalCart()%>'
//          tax: '0.07',
//          shipping: '0.03',
//          handling_fee: '1.00',
//          shipping_discount: '-1.00',
//          insurance: '0.01'
        }
      },
      description: 'Giỏ hàng của bạn !!',
      
//      custom: '90048630024435',
      //invoice_number: '12345', Insert a unique invoice number
//      payment_options: {
//        allowed_payment_method: 'INSTANT_FUNDING_SOURCE'
//      },
//      soft_descriptor: 'ECHI5786786',
      item_list: {
        items: [
         
            <%for(Map.Entry<Long, Item> list: cart.getCartItem().entrySet()){%>  
        {
          name: '<%=list.getValue().getSanpham().getTensp()%>',
          quantity: '<%=list.getValue().getSoluong()%>',
          price: '<%=list.getValue().getSanpham().getGiasp()%>',
          currency: 'USD'
        },
         
        <%}%>
        ]
        
      }
      
    }],
    note_to_payer: 'Liên hệ với chúng tôi nếu có bất kì lỗi gì'
  });
},
    // Thực hiện thanh toán
    onAuthorize: function(data, actions) {
      return actions.payment.execute().then(function() {
        // Show a confirmation message to the buyer
        window.alert('Tổng số tiền bạn đã thanh toán là : $'+ <%=cart.TotalCart()%>);
        
      });
    }
  }, '#paypal-button');
  
</script>
<a href="checkout.jsp">Xác nhận đơn hàng</a>
<!--<button></button>-->
        
    </body>
</html>
