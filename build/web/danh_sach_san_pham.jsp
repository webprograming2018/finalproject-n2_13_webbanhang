
<%@page import="model.Giohang"%>
<%@page import="model.san_pham"%>
<%@page import="controller.san_pham_DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" type="img/png" href="img/favicon.png">
	<meta name="viewport" content="width=device-width, initial-scale=1"> <!-- khai báo cho reponsivte -->
	<title>Danh sách sản phẩm</title>
	<link rel="stylesheet" type="text/css" href="css/danh_sach.css">
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
                    san_pham_DAO spDAO  = new san_pham_DAO();  // gọi class
                   
                    Giohang cart = (Giohang) session.getAttribute("cart"); // khai báo giỏ hàng( key = cart)
                    if (cart == null){ 
                        cart = new Giohang();
                        session.setAttribute("cart", cart);
                    }
                          
                %>
        <div id="content">
		<div class="breadcrumb">
			<a href="#">Trang chủ</a>
			<span class="label"> > </span>
			<span style="color: #ff5313">Danh sách sản phẩm</span>
		</div>
		<div class="main-left-list">
			<div class="search-product">
				<p class="tieu-de">Tìm sản phẩm</p>
				<form action="" class="frm-3">
					<input type="text" class="tim-kiem" placeholder="Tìm sản phẩm...">
					<button class="btn-tim-kiem"></button>
				</form>
			</div>
			<div class="filter">
				<p class="tieu-de">Lọc theo giá</p>
			</div>
			<div class="category">
				<p class="tieu-de">Thể loại</p>
				<div class="noi_dung">
					<p class="noi-dung-2">
						<span class="ten"><a class="t_l" href="">Ghế dài</a></span></p>
					<p class="noi-dung-2">
						<span class="ten"><a class="t_l" href="">Salon</a></span></p>
					<p class="noi-dung-2">
						<span class="ten"><a class="t_l" href="">Ghế thấp</a></span></p>
					<p class="noi-dung-2">
						<span class="ten"><a class="t_l" href="">Ghế cao</a></span></p>
					
				</div>
			</div>	
			<div class="size-4">
				<p class="tieu-de">Kích cỡ</p>
				<div class="main">
					<p class="noi-dung-2"><span class="ten-1"><a class="t_l_1" href="">S</a></span></p>
					<p class="noi-dung-2"><span class="ten-1"><a class="t_l_1" href="">M</a></span></p>
					<p class="noi-dung-2"><span class="ten-1"><a class="t_l_1" href="">L</a></span></p>
					<p class="noi-dung-2"><span class="ten-1"><a class="t_l_1" href="">XL</a></span></p>
				</div>
			</div>
			<div class="tag">
				<p class="tieu-de">Quảng cáo</p>
				<p class="tag-1" id="can-dong"><span class="size-1">asian </span><span class="size-2">brown </span><span class="size-3">euro fashion</span></p>
				<p class="tag-1"><span class="size-1">france </span><span class="size-2">hat </span><span class="size-3">t-shirt </span><span class="size-2">teen</span></p>
				<p class="tag-1"><span class="size-2">travel </span><span class="size-2">white</span></p>
			</div>
			<div class="banner-1">
				<img src="img/banner/banner-10.png" alt="Banner 1" width="270px">
			</div>
		</div>
                   
		<div class="main-right-list">
                    <%
                        for(san_pham p: spDAO.getlistSP()){
                    %>
			<div class="san-pham-5" >
			<div id="anhto-1" class="anhto">
			<a href="chi_tiet_1sp.jsp?ID=<%=p.getIdsp()%>">
			<img src="<%=p.getAnhsp()%>" alt="Chi tiết sản phẩm"></a>
			</div>
			<div id="noidung-1" class="noi-dung">
				<p class="title"><%=p.getTensp()%></p>
				<span class="gia-tien" style="font-size: 20px;">$<%=p.getGiasp()%></span>
				<div class="mo-ta-3">Lorem ipsum dolor sit amet, 
                                    consectetur adipisicing elit. Sunt eos temporibus aspernatur 
                                    quasi vel, velit error quae, exercitationem quia facilis, 
                                    mollitia quas explicabo. Voluptate sed excepturi, 
                                    at voluptatibus eaque corporis.</div>
                                <button class="add-cart-1"><a href="Cart_Servlet?command=plus&ID=<%=p.getIdsp()%>">Thêm giỏ hàng</a></button>
			</div>
			</div>
			<%}%>
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
