<%-- 
    Document   : giohang
    Created on : Nov 15, 2018, 9:01:47 PM
    Author     : Dell
--%>

<%@page import="model.Taikhoan"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.san_pham_DAO"%>
<%@page import="model.Giohang"%>
<%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" type="img/png" href="img/favicon.png">
	<meta name="viewport" content="width=device-width, initial-scale=1"> <!-- khai báo cho reponsivte -->
	<title>Giỏ hàng</title>
	<link rel="stylesheet" type="text/css" href="css/giohang.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!--<link rel="stylesheet" href="css\bootstrap.min.css">-->
        <script src="jquery-3.3.1.min.js"></script>
        <script src="css\bootstrap.min.js"></script> 
        <script type="text/javascript" language="javascript" src="javascrip-jquery.js"></script>
        <!--<script type="text/javascript" language="javascript" src="javascrip-jquery.js"></script>--> 
        <script type="text/javascript" src="jquery.elevatezoom.js"></script>
    </head>
    <body>
               
        <jsp:include page ="header.jsp"></jsp:include>
         <%
             Taikhoan users = (Taikhoan) session.getAttribute("user");
            if(users == null){
              response.sendRedirect("/Lap_trinh_web/dang_nhap.jsp");
          }
//                    san_pham_DAO spDAO  = new san_pham_DAO();
                    Giohang cart = (Giohang) session.getAttribute("cart");
                    
                    if (cart == null){
                        cart = new Giohang();
//                        
                        session.setAttribute("cart", cart);
                         
                    }
                    int temp = cart.CountItem();
//                    ArrayList<Double> arrayList = new ArrayList<Double>();
                %>
            <div id="content">
                <form action="${initParam['posturl']}" method="POST">
            <div class="row">
            <table class="table table-bordered" id="table-products">
                <thead>
                   <tr>
                    	<th>Hình ảnh</th>
                        <th>Tên sản phẩm</th>
                        <th>Giá sản phẩm</th>
                        <th>Số lượng</th>
                        <th>Tổng giá</th>
                       
                    </tr>
                    <tr></tr>
                </thead>
                <!--Phần thanh toán paypal-->
            <input type="hidden" name ="upload" value="1"/>
            <input type="hidden" name ="return" value="${initParam['returnurl']}"/>
            <input type="hidden" name ="cmd" value="_cart"/>
            <input type="hidden" name ="business" value="${initParam['business']}"/>
            
             <%  int a =0;
        String[] s = new String[100] ;
        String[] c = new String[100];
        String[] b= new String[100];
        
        for(Map.Entry<Long, Item> list: cart.getCartItem().entrySet()){
            a++;
        for(int i=1; i<=temp; i++){
            
            s[i] = "item" +"_"+"name"+"_"+a;
            c[i] = "amount"+"_"+a;
            b[i] = "quantity"+"_"+a;
            
         
            %>
            <input type="hidden" name ="<%=s[i]%>" value="<%=list.getValue().getSanpham().getTensp()%>"/>
            <input type="hidden" name ="<%=c[i]%>" value="<%=list.getValue().getSanpham().getGiasp()%>"/>
            <input type="hidden" name ="<%=b[i]%>" value="<%=list.getValue().getSoluong()%>"/>
      <%}%>
            <%}%>
            
            
            
            
            
            
                <tbody>
                    
                     <%for(Map.Entry<Long, Item> list: cart.getCartItem().entrySet()){%>
                    <tr>
                        <td><img src="<%=list.getValue().getSanpham().getAnhsp()%>"></td>
                        <td><%=list.getValue().getSanpham().getTensp()%> </td>
                        <td>$<%=list.getValue().getSanpham().getGiasp()%></td>
                        <td class="display_soluong">
                            <a href="Cart_Servlet?command=subitem&ID=<%=list.getValue().getSanpham().getIdsp()%>">Trừ</a>
                            <input name="text" value="<%=list.getValue().getSoluong()%>">
                            <a href="Cart_Servlet?command=pluscart&ID=<%=list.getValue().getSanpham().getIdsp()%>">Thêm</a>
                            
                        </td>
                        
                        <td>$<%=list.getValue().getSoluong() * list.getValue().getSanpham().getGiasp()%>
                        <span class="span_xoa"><a href="Cart_Servlet?command=remove&ID=<%=list.getValue().getSanpham().getIdsp()%>">XÓA</a></span>
                        
                        </td>
                    </tr>
                    
                    <%}%>
                    
                    <tr>
                        <td colspan="4">Tổng tiền thanh toán</td>
                        <td>$<%=cart.TotalCart()%></td>
                        
                    </tr>
                    
                </tbody>
            </table>
        </div>
        <div>
            <button class="btn btn-lg btn-success" id="button_paypal">
              Thanh toán paypal
            </button>
            <!--<input type="submit"  value="thanhtoan"/>-->
<!--            <button class="btn btn-lg btn-success" id="button_payment">Thanh toán tại nhà</button>
-->           
        </div>
                        </form>
<!--                <button class="btn btn-lg btn-success" id="button_huy">
                <a href="" id="btn_funtion">Hủy hóa đơn</a>
               </button>-->
	</div>
       
        <jsp:include page ="footer.jsp"></jsp:include>
       
    </body>
</html>
