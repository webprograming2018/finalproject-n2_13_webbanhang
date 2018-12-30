<%-- 
    Document   : chi_tiet_1sp
    Created on : Nov 11, 2018, 3:20:33 PM
    Author     : Dell
--%>

<%@page import="controller.san_pham_DAO"%>
<%@page import="model.san_pham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" type="img/png" href="img/favicon.png">
	<meta name="viewport" content="width=device-width, initial-scale=1"> <!-- khai báo cho reponsivte -->
	<title>Chi tiết 1 sản phẩm</title>
	<link rel="stylesheet" type="text/css" href="css/chi_tiet_sp_1.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!--<link rel="stylesheet" href="css\bootstrap.min.css">-->
        <script src="jquery-3.3.1.min.js"></script>
        <script src="css\bootstrap.min.js"></script> 
        <script type="text/javascript" language="javascript" src="javascrip-jquery.js"></script>
        <script type="text/javascript" language="javascript" src="javascrip-jquery.js"></script> 
        <script type="text/javascript" src="jquery.elevatezoom.js"></script>
    </head>
    <body>
        <jsp:include page ="header.jsp"></jsp:include>
        <%
            san_pham_DAO proDAO = new san_pham_DAO();
            san_pham sp = new san_pham();
            String productID = "";
            if(request.getParameter("ID")!=null){
                productID = request.getParameter("ID");
                sp = proDAO.getSP(Long.parseLong(productID));
            }
        %>
        <div id="content">
		<div class="breadcrumb">
			<a href="#">Trang chủ</a>
			<span class="label">></span>
			<span style="color: #ff5313">Chi tiết sản phẩm</span>
		</div>
		<div class="product-info">
			<div class="left-info-product">
				<div class="anh-to">
					<img id="zoom_01" src="img/product-details/product-detalis-l1.jpg" data-zoom-image="img/product-details/product-detalis-lag1.jpg">
				</div>
				<div class="anh-nho">
					<img src="img/product-details/product-detalis-s1.jpg" alt="Chi tiết sản phẩm">
					<img src="img/product-details/product-detalis-s2.jpg" alt="Chi tiết sản phẩm">
					<img src="img/product-details/product-detalis-s3.jpg" alt="Chi tiết sản phẩm">
					<img src="img/product-details/product-detalis-s4.jpg" alt="Chi tiết sản phẩm">
					<img src="img/product-details/product-detalis-s4.jpg" alt="Chi tiết sản phẩm">
				</div>
			</div>
			<div class="right-info-product">
                            <p class="title"><%=sp.getTensp()%></p>
				<span class="gia-cu-1">$162.00</span>
				<span class="gia-moi"><%=sp.getGiasp()%></span>
				<p class="mo-ta-1">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
				<p class="size">Kích cỡ:</p>
				<select>
  					<option value="S">S</option>
  					<option value="S">M</option>
  					<option value="S">L</option>
  					<option value="S">XL</option>
				</select>
				<p class="color">Màu sắc:</p>
				<div class="wrap-mau">
					</button>
					<button id="cat_color0" value="img/product-details/product-detalis-l1.jpg">
						<span class="mau"></span>
					</button>
				<button id="cat_color1" style="background-color: red" 
				value="img\product-details\doimau\red.jpg"
				>
						<span class="mau"></span>
					</button>
					<button id="cat_color2" style="background-color: violet" 
					value="img\product-details\doimau\violet.jpg">
						<span class="mau"></span>
					</button>
					<button id="cat_color3" style="background-color: green" value="img\product-details\doimau\green.jpg"><span class="mau"></span>
					</button>
				</div>
				<form action="" class="frm-2">
					<button class="giam">-</button>
					<input type="text" class="so-luong" placeholder="02">
					<button class="tang">+</button>
					<button class="add-cart">Thêm giỏ hàng</button>
				</form>
				<p class="categories">Thể loại:</p>
				<p class="detail">Ghế đơn, Ghế da</p>
				<p class="share">Chia sẻ:</p>
			</div>	
		</div>
		<div class="product-detail">
			<div class="tab-detail">
				<ul>
					<li class="describe">MIÊU TẢ CHI TIẾT</li>
					<li class="imfomation">THÊM THÔNG TIN</li>
					<li class="feedback">Ý KIẾN PHẢN HỒI</li>
				</ul>
			</div>
			<p class="mieuta">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
			Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
			Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
			Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
			<br>
			<br>
			Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
			<br>
			<br>
			Lorem Ipsum is simply dummy text of the printing and typesetting industry<br>
			Lorem Ipsum is simply dummy text of the printing and typesetting industry<br>
			Lorem Ipsum is simply dummy text of the printing and typesetting industry<br>
			Lorem Ipsum is simply dummy text of the printing and typesetting industry<br>
			Lorem Ipsum is simply dummy text of the printing and typesetting industry

			</p>
			<p class="thongtin">
				Đỗ Anh Tú

			</p>
			<p class="phanhoi">
				Đỗ Anh Tú & những người bạn

			</p>
		</div>
		<div class="product-relate">
			<p class="title-1">SẢN PHẨM LIÊN QUAN</p>
			<div class="san-pham-4">
				<div class="anh-6">
					<a href="#"><img src="img/product/pro-3.jpg" alt="San pham 4"></a>
				</div>
				<div class="noi-dung-1">
					<p class="ten-san-pham-2">Ornare consequat</p>
					<span class="gia-cu">$120.00 </span>
					<span class="gia-tien-1">$120.00 </span>
				</div>
			</div>
			<div class="san-pham-4">
				<div class="anh-6">
					<a href="#"><img src="img/product/pro-4.jpg" alt="San pham 4"></a>
				</div>
				<div class="noi-dung-1">
					<p class="ten-san-pham-2">Ornare consequat</p>
					<span class="gia-tien-1">$120.00 </span>
				</div>
			</div>
			<div class="san-pham-4">
				<div class="anh-6">
					<a href="#"><img src="img/product/pro-5.jpg" alt="San pham 4"></a>
				</div>
				<div class="noi-dung-1">
					<p class="ten-san-pham-2">Ornare consequat</p>
					<span class="gia-cu">$120.00 </span>
					<span class="gia-tien-1">$120.00 </span>
				</div>
			</div>
		</div>


		<div class="brand-logo">
			<div class="anh-5">
				<img src="img/brand-logo/brand-4.png" alt="barnd">
			</div>
			<div class="anh-5">
				<img src="img/brand-logo/brand-1.png" alt="barnd">
			</div>
			<div class="anh-5">
				<img src="img/brand-logo/brand-2.png" alt="barnd">
			</div>
			<div class="anh-5">
				<img src="img/brand-logo/brand-3.png" alt="barnd">
			</div>
			<div class="anh-5">
				<img src="img/brand-logo/brand-4.png" alt="barnd">
			</div>
		</div>
		
	</div>
        <jsp:include page ="footer.jsp"></jsp:include>
    </body>
</html>
