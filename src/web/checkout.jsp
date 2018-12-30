<%-- 
    Document   : index
    Created on : Nov 10, 2018, 7:12:28 PM
    Author     : Dell
--%>

<%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page import="model.Giohang"%>
<%@page import="controller.san_pham_DAO"%>
<%@page import="model.Taikhoan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" type="img/png" href="img/favicon.png">
  
	<title>Thanh toán</title>
         <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- khai báo cho reponsivte -->
  <!-- <link rel="stylesheet" type="text/css" href="reset.css"> -->
	<link rel="stylesheet" type="text/css" href="css/index.css">
  <!--<link rel="stylesheet" type="text/css" href="index-reponsive.css">-->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script type="text/javascript" language="javascript" src="javascrip-jquery.js"></script>
  <script type="text/javascript" src="jquery.elevatezoom.js"></script>
  <style>
      #content input{
          width: 270px;
          height: 30px;
        padding-left: 20px;
        border: none;
        border-radius: 5px 5px 5px 5px;
        background: #ccc;
      
      }
      
      #content .address{
         margin-bottom: 10px;
      }
      
      #content .account{
          margin-bottom: 10px;
      }
      #content table, tr, th {
          border: 1px solid #ccc;
      }
      #content th{
          width: 115px;
          height: 35px;
      }
      
      #content .totalp{
          margin-top: 10px;
      }
  </style>
   
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
//                        
                        session.setAttribute("cart", cart);
                         
                    }
        %>
             
    <div id="header">
    <div class="top-header">
      <ul>
          
          <li class="li_2">Chào mừng: 
              <%if(users !=null){%>
              <span style="font-weight: bold; font-size: 16px;"><%=users.getUserEmail()%></span>
              <%}%>
          </li>

          <li class="li_1">
              <button class="btn btn-lg btn-success" id="login1"><a href="dang_nhap.jsp">Đăng nhập</a></button>
             
          </li>
          <li> <button class="btn btn-lg btn-success" id="register"><a href="dang_ki.jsp">Đăng kí</a></button></li>
        </ul>
    </div> 
		<div class="logo"><a href="#"><img src="img\logo\logo.png"></a></div>
		<div class="right_header" >
			<form action="">
			<input class="inputSearch" type="text" placeholder=" Tìm kiếm sản phẩm..." 
                                name="text_search">
                        <div class="resultSearch" id="resultSearch">
				<h4>Tìm thấy <b></b> Sản phẩm</h4>
				<div class="kq">
<!--                                        <a href="#">
                                            <img src="img/product/pro-1.jpg" alt="">
                                                <span>sản phẩm 1</span>
                                                <span>$20</span>
                                        </a>-->
				</div>
			</div>
			<button type="submit"><b class="fa fa-search"></b></button>
			
			</form>
			<div class="right_header_giohang">

				<form action="">
					<img src="img\icon-img\cart.png" id="gh_open">
                                        
                                        <div class="showcart">
                                            <%for(Map.Entry<Long, Item> list: cart.getCartItem().entrySet()){%>
						<ul>
                                                <li><%=list.getValue().getSanpham().getTensp()%> </li>
						<li>(x<%=list.getValue().getSoluong()%>)</li>
                                                <li>:     $<%=list.getValue().getSanpham().getGiasp()%></li>
                                                <!--<li><a href="Cart_Servlet?command=remove&ID=<%=list.getValue().getSanpham().getIdsp()%>">X</a></li>-->
						</ul>
                                                <%
                                                }
                                                %>
						<div class="totalcost">Tổng giá : $<%=cart.TotalCart()%></div>
						<div class="button-send">
							<button class="close_cart">Đóng</button>
                                                        <a href="index.jsp">Xem giỏ hàng</a>
						</div>
					</div>
                                        
                                        <b>CART: <%=cart.CountItem()%></b><br>
					
				</form>

			</div>

		</div>
		<div class="Menu" >
      <ul>
        <li><a href="checkout.jsp">Trang Chủ</a></li>
        <li><a href="checkout.jsp">Sản Phẩm</a></li>
        <li><a href="checkout.jsp">Giỏ Hàng</a></li>
        <li><a href="checkout.jsp">Tài Khoản</a></li>
        <li><a href="">Tư Vấn</a></li>
        <li><a href="">Giới Thiệu</a></li>
        <li><a href="">Liên Hệ</a></li>
      </ul>
		</div>

	</div>
  <!-- keo len top -->
  <div class="sec-1">
    <a href="javascript:void(0)" id="scrolltop" class="up-top">
    <img src="img\icon-img\menu.png"></a>
  </div>
         <div id="content">
            
                <form action="CheckOutServlet" method="POST">
                    <h2>Chi tiết đơn hàng</h2>
                <div>
                    <span class="word"> Địa chỉ giao hàng: </span>
                    <input type="text" placeholder="Nhập địa chỉ..." name="address">
                </div>              
                <div>
                    <span class="word"> Tên tài khoản: </span>
              <%if(users !=null){%>
                    <span style="font-weight: bold; font-size: 16px;"><%=users.getUserEmail()%></span>
              <%}%>
              <%for(Map.Entry<Long, Item> list: cart.getCartItem().entrySet()){%>
              <div>
                  <span>Tên sản phẩm: <%=list.getValue().getSanpham().getTensp()%> </span>
                  <span>Giá sản phẩm: $<%=list.getValue().getSanpham().getGiasp()%></span>
                  <span>Số lượng: <%=list.getValue().getSoluong()%></span>
                  <span>Tổng giá:$<%=list.getValue().getSoluong() * list.getValue().getSanpham().getGiasp()%></span>
              </div>
              <%}%>
              <div class="totalp" style="font-weight: bold; font-size: 18px;">
                  <span>Tổng tiền:$<%=cart.TotalCart()%></span> 
              </div>
                    
              <button class="btn btn-lg btn-success" id="button_payment">
                  Xác nhận
              </button> 
            </form>
            </div>  
        
        <jsp:include page ="footer.jsp"></jsp:include>
    </body>
</html>
