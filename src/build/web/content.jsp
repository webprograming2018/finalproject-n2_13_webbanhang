<%-- 
    Document   : content
    Created on : Nov 10, 2018, 7:16:30 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    	<div id="content">

		<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    		<ol class="carousel-indicators">
      			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      			<li data-target="#myCarousel" data-slide-to="1"></li>
      			<li data-target="#myCarousel" data-slide-to="2"></li>
      			<li data-target="#myCarousel" data-slide-to="3"></li>
    		</ol>

    
    		<div class="carousel-inner">
      			<div class="item active">
        			<img src="img\slider\slider-1.jpg" alt="ghe1" >
         			<div class="carousel-caption">
         				<h1>ÐỖ ANH TÚ</h1>
         			</div>
      			</div>
      			<div class="item">
        			<img src="img\slider\slider-2.jpg" alt="ghe2" >
        			<div class="carousel-caption">
         				<h1>ÐỖ ANH TÚ</h1>

         			</div>
      			</div>
    
      			<div class="item">

        			<img src="img\slider\slider-3.jpg" alt="ghe3" >
       				<div class="carousel-caption">
         				<h1>ÐỖ ANH TÚ</h1>

         			</div>
      			</div>

      			<div class="item">
        			<img src="img\slider\slider-4.jpg" alt="ghe4" >
        			<div class="carousel-caption">
         				<h1>ÐỖ ANH TÚ</h1>

         			</div>
      			</div>
    		</div>

    <!-- Left and right controls -->
    	<a class="left carousel-control" href="#myCarousel" data-slide="prev">
      		<span class="glyphicon glyphicon-chevron-left"></span>
      		<span class="sr-only">Previous</span>
    	</a>
    	<a class="right carousel-control" href="#myCarousel" data-slide="next">
      		<span class="glyphicon glyphicon-chevron-right"></span>
      		<span class="sr-only">Next</span>
   		</a>
  		</div>
  		<div class="conten_banner">
  			<div class="conten_banner_left"><a href="#"><img src="img\banner\1.jpg"></a></div>
  			<div class="conten_banner_right_top1"><a href="#"><img src="img\banner\2.jpg"></a></div>
  			<div class="conten_banner_right_top2"><a href="#"><img src="img\banner\3.jpg"></a></div>
  			<div class="conten_banner_bottom"><a href="#"><img src="img\banner\4.jpg"></a></div>
  			
  		</div>
  		<!-- Ph?n bán hàng dùng ?n hi?n -->
  		<div class="sale">
  			<div class="sale_left">
          <p class="tieu-de">Sản phẩm nổi bật</p>
            <div class="san-pham-1">
              <div class="anh-1">
                <a href="#"><img src="img/product/quickview-s5.jpg" alt="San pham 1"></a>
              </div>
              <div class="noi-dung">
                <p class="ten-san-pham">Ornare consequat</p>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span><br>
                <span class="menh_gia_moi">$120.00</span>
              </div>
            </div>
            <div class="san-pham-1">
              <div class="anh-1">
                <a href="#"><img src="img/product/quickview-s4.jpg" alt="San pham 2"></a>
              </div>
              <div class="noi-dung">
                <p class="ten-san-pham">Ornare consequat</p>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span><br>
                <span class="menh_gia_moi">$125.00</span>
              </div>
            </div>
            <div class="san-pham-1">
              <div class="anh-1">
                <a href="#"><img src="img/product/quickview-s3.jpg" alt="San pham 3"></a>
              </div>
              <div class="noi-dung">
                <p class="ten-san-pham">Ornare consequat</p>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span><br>
                <span class=" menh_gia_moi">$110.00</span>
              </div>
            </div>
            <div class="san-pham-1">
              <div class="anh-1">
                <a href="#"><img src="img/product/quickview-s2.jpg" alt="San pham 4"></a>
              </div>
              <div class="noi-dung">
                <p class="ten-san-pham">Ornare consequat</p>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span>
                <span class="glyphicon glyphicon-star atri0"></span><br>
                <span class="menh_gia_moi">$130.00</span>
              </div>
            </div>   
        </div>
  			<div class="sale_top_right" >
  				<span class="best_seler">BÁN CHẠY</span> 
  				<span class="new_product" >SẢN PHẨM MỚI</span>
  				<span class="sale_off">GIẢM GIÁ</span>
  			</div>
  			<div class="sale_bot_right">
          <div class ="click_product">
            <div class="giay giay1">
            <span class="giam_gia" >SALE</span>
            <div><img src="img\product\pro-6.jpg"></div>
            <span class="ten_sp">Ornare consequat</span><br>
            
            <span class="glyphicon glyphicon-star atri0"></span>
            <span class="glyphicon glyphicon-star atri0"></span>
            <span class="glyphicon glyphicon-star atri0"></span>
            <span class="glyphicon glyphicon-star atri0"></span>
            <span class="glyphicon glyphicon-star atri0"></span><br>
            <span class="menh_gia_cu">$162.00</span>
            <span class="menh_gia_moi">$120.00</span>
          </div>
          <div class="giay giay2">
            <span class="giam_gia" >SALE</span>
            <div><img src="img\product\pro-4.jpg"></div>
            <span class="ten_sp">Ornare consequat</span><br>
            
            <span class="glyphicon glyphicon-star atri0"></span>
            <span class="glyphicon glyphicon-star atri0"></span>
            <span class="glyphicon glyphicon-star atri0"></span>
            <span class="glyphicon glyphicon-star atri0"></span>
            <span class="glyphicon glyphicon-star atri0"></span><br>
            
            <span class="menh_gia_moi">$120.00</span>
          </div>
          <div class="giay giay3">
            <span class="giam_gia" >SALE</span>
            <div><img src="img\product\pro-2.jpg"></div>
            <span class="ten_sp">Ornare consequat</span><br>
            
            <span class="glyphicon glyphicon-star atri0"></span>
            <span class="glyphicon glyphicon-star atri0"></span>
            <span class="glyphicon glyphicon-star atri0"></span>
            <span class="glyphicon glyphicon-star atri0"></span>
            <span class="glyphicon glyphicon-star atri0"></span><br>
            <span class="menh_gia_cu">$200.00</span>
            <span class="menh_gia_moi">$150.00</span>
          </div>
        </div>
  				<div class="click_bestsell"></div>
  				<div class="click_sale_off"></div>
  			</div>
  		</div>
      <div class="phan_hoi" >
        <div class="get_letter">
          <span class="letter">Gửi thư phản hồi</span>
          <p>Đăng nhập địa chỉ email</p>
          <form>
          <input type="text" name="txt_email_letter" placeholder="Email" action=""><br>
          <button class="btn_sub">Xác nhận</button>
          </form>
           <!--  <div class="banner_qc_letter"><img src="img\banner\banner-10.png"></div> -->
      <div class="tag">
        <p class="tieu-de">Ý kiến phản hồi</p>
        <i>&nbsp&nbsp&nbspWeb bán hàng rất uy tín</i><br>
        <i>&nbsp&nbsp&nbspPhục vụ tận tình</i><br>
        <i>&nbsp&nbsp&nbspGiao hàng nhanh</i><br>
        <i>&nbsp&nbsp&nbspHàng đẹp, chất lượng tốt</i><br>
        <i>&nbsp&nbsp&nbspGiá cả hợp lý</i>
      </div>
        </div>
        <div class="product_block">
          <div class="banner_qc"><img src="img\banner\banner-5.png"></div>
          <div class="new_product_ph">
            <p class="tieu_de">Sản phẩm mới</p>
            <div class="new_sp">
              <img src="img\product\pro-1.jpg">
              <p style="font-weight: bold">Ornare consequat</p>
              <span class="menh_gia_moi">150.00</span>
            </div>
             <div class="new_sp">
              <img src="img\product\pro-1.jpg">
              <p style="font-weight: bold">Ornare consequat</p>
              <span class="menh_gia_moi">$150.00</span>
            </div>
            <div class="new_sp">
              <img src="img\product\pro-1.jpg">
              <p style="font-weight: bold">Ornare consequat</p>
              <span class="menh_gia_moi">$150.00</span>
            </div>
            <div class="new_sp">
              <img src="img\product\pro-1.jpg">
              <p style="font-weight: bold">Ornare consequat</p>
              <span class="menh_gia_moi">$150.00</span>
            </div>
            <div class="new_sp">
              <img src="img\product\pro-1.jpg">
              <p style="font-weight: bold">Ornare consequat</p>
              <span class="menh_gia_moi">$150.00</span>
            </div>
            <div class="new_sp">
              <img src="img\product\pro-1.jpg">
              <p style="font-weight: bold">Ornare consequat</p>
              <span class="menh_gia_moi">$150.00</span>
            </div>
          </div>
          <div class="custom_block">
            <p class="tieu_de">Tùy chọn</p>
              <div class="anh-4"><img src="img/banner/banner-6.jpg"></div>
              <div class="anh-4"><img src="img/banner/banner-7.jpg" ></div>
              <div class="anh-4"><img src="img/banner/banner-8.jpg" ></div>
              <div class="anh-4"><img src="img/banner/banner-9.jpg"></div>
          </div>
        </div>
        <div class="logo_bottom">
          <div class="anh-5"><img src="img/brand-logo/brand-4.png" ></div>
          <div class="anh-5"><img src="img/brand-logo/brand-1.png" ></div>
          <div class="anh-5"><img src="img/brand-logo/brand-2.png" ></div>
          <div class="anh-5"><img src="img/brand-logo/brand-3.png" ></div>
          <div class="anh-5"><img src="img/brand-logo/brand-4.png" ></div>
        </dir>
      </div>
    </div>
	</div>
    </body>
</html>
