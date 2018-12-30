// phần xử lý số đăng nhập ẩn hiện
$(document).ready(function (){
    $('#click_login').click(function (){
       $('#li_1').hide(10000);
//       $('#register').hide(10000)
    });
});

    $(document).ready(function(){
        // phần giỏ hàng
        $('#gh_open').click(function(){
        $('.showcart').show(1000);
      });
      $('.close_cart').click(function(){
       
        $('.showcart').hide(1000);

      });
//      $('.thanhtoan').click(function (){
//          $('.xoa1').remove();
//      });
      // Phần json
      $('.inputSearch').keyup(function(event) {
		var result = $('input[name="text_search"]').val().toLowerCase(); //chuyển đổi thành chữ thường
		$('.resultSearch').addClass('show');  
		$.getJSON("./dulieu.json", function(data) {
			var product = "";
			var dem = 0;
	    	$.each(data, function(key, value) {
	    		var arr = value.NameProduct.toLowerCase(); // lấy tên sản phẩm trong json chuyển nó thành chữ thường
	    		if(arr.indexOf(result) >= 0 && result!= ""){
	    			dem++;
		    		product += '<a>';
		    		product += '<img src="img/product/'+value.UrlImage+'">';
		    		product += '<span>';
		    		product += value.NameProduct;
		    		product += '</span>';
                                product += '<span>';
		    		product += value.Price;
		    		product += '</span>';
		    		product += '</a>';
	    		}
                     
	    	});
                
	    	$('.resultSearch .kq').html(product);
	    	$('.resultSearch h4 b').html(dem);
    	});
	});
        $('.resultSearch .kq').click(function (){ 
            window.location.replace("index.jsp"); // khi nhấn vào 1 sp thì sẽ load lại trang
        });
        

//      $('.add-cart-1').click(function(){
//        
//        var proId = $(this).attr('producID');
//        var imgURL = $('#anhto-'+proId).find('img').attr('src');
//        var pName = $('#noidung-'+proId).children('.title').text();
//        var cost = $('#noidung-'+proId).children('.gia-tien').text();
//        var obj = {
//            id: proId,
//            productName : pName,
//            imageurl : imgURL,
//            cost: cost
//
//        };
//        // kiểm tra sản phẩm có trong giỏ hàng hay chưa
//        var temp = false;
//        for (var i = 0 ; i < cart.length; i++) {
//          if(cart[i].id == obj.id){
//            temp = true;
//            break; 
//          }
//        }
//        // sản phẩm chưa có trong giỏ hàng
//        if(temp === false ){
//          obj.quantity = 1;
//          cart.push(obj);
//        }else{
//          cart[i].quantity += 1;
//        }
//        console.log(cart[i]);
//        
//      });
  	// 	8. Thay đổi màu sắc của ảnh
  		$("#cat_color0").click(function(){
  			$("#zoom_01").attr("src",$(this).val());
  		});	
  		$("#cat_color1").click(function(){
  			$("#zoom_01").attr("src",$(this).val());
  			// $("#zoom_01").attr("",$(this).val());
  		});	
  		$("#cat_color2").click(function(){
  			$("#zoom_01").attr("src",$(this).val());
  		});	
  		$("#cat_color3").click(function(){
  			$("#zoom_01").attr("src",$(this).val());
  		});	
  	// 	6. zoom ảnh to nhỏ
  		$("#zoom_01").elevateZoom({
  			zoomType: "inner",
  			cursor: "crosshair"
		});
  	// 	7. ẩn hiện phần thông tin
  		$(".describe").click(function(){

  			$(".mieuta").show(1000);
  			$(".thongtin").hide(1000);
  			$(".phanhoi").hide(1000);
  			$(".describe").css('color', '#ff8b60');

  			$(".imfomation").css('color', '');;

  			$(".feedback").css('color', '');;

  		});

  		$(".imfomation").click(function(){
  			$(".thongtin").show(1000);
  			$(".mieuta").hide(1000);
  			$(".phanhoi").hide(1000);

  			$(".describe").css('color', 'black');

  			$(".imfomation").css('color', '#ff8b60');
  			
  			$(".feedback").css('color', '');

  		});

  		$(".feedback").click(function(){
  			$(".phanhoi").show(1000);
  			$(".mieuta").hide(1000);
  			$(".thongtin").hide(1000);

  			$(".describe").css('color', 'black');;

  			$(".imfomation").css('color', '');;
  			
  			$(".feedback").css('color', '#ff8b60');
  		});
  	// 1.Ẩn hiện phần bán hàng
  		$(".best_seler").click(function(){
  			$(".click_bestsell").show(1000);
  			$(".click_product").hide(1000);
  			$(".click_sale_off").hide(1000);
  			$(".best_seler").css('border-bottom', 'solid').css('color', 'red');

  			$(".new_product").css('border-bottom', '').css('color', '');;

  			$(".sale_off").css('border-bottom', '').css('color', '');;

  		});

  		$(".new_product").click(function(){
  			$(".click_product").show(1000);
  			$(".click_bestsell").hide(1000);
  			$(".click_sale_off").hide(1000);

  			$(".best_seler").css('border-bottom', 'none').css('color', 'black');

  			$(".new_product").css('border-bottom', 'solid').css('color', 'red');
  			
  			$(".sale_off").css('border-bottom', '').css('color', '');

  		});

  		$(".sale_off").click(function(){
  			$(".click_sale_off").show(1000);
  			$(".click_bestsell").hide(1000);
  			$(".click_product").hide(1000);

  			$(".best_seler").css('border-bottom', 'none').css('color', 'black');;

  			$(".new_product").css('border-bottom', '').css('color', '');;
  			
  			$(".sale_off").css('border-bottom', 'solid').css('color', 'red');
  		});

      // 2.click cuộn lên trên top
      $("#scrolltop").click(function(){
        $("html, body").animate({scrollTop: 0},"slow");

      });

      // 3.Giữ menu luôn ở trên đầu 
      pos = $(".Menu").position(); // lấy vị trí hiện tại của Menu
      $(window).scroll(function(){
        var posScroll = $(document).scrollTop(); // lấy vị trị khi người dùng cuộn 

        if (parseInt(posScroll) > parseInt(pos.top)) {
          $(".Menu").addClass('fixed');
        }else{
          $(".Menu").removeClass('fixed');
        }
      });
      // 4. Thay đổi font chữ
       $("#font").change(function() {
        var str = "";
        $("#font option:selected").each(function() {
          str += $(this).attr('value') + " ";
          $("body").css('font-family', str);
        });
      });

      //5.Thay đổi màu sắc trang web
      $("#color").change(function() {
        var param = "";
        $("#color option:selected").each(function() {
          param += $(this).attr('value');
          if (param == "orange") {
            $(".Menu ul, .footer-bottom").css('background-color', '#ff9a23');
            $(".footer-top").css('background-color', '#f8b25f');
            $("body").css('background-color', '#fce6cc');
          } else {
            $(".Menu ul, .footer-bottom").css('background-color', '#181818');
            $(".footer-top").css('background-color', '#2f2f2f');
            $("body").css('background-color', '#eaeaea');
        }
        });      
      });
  	});
//    var obj = {
//            id: proId,
//            productName : pName,
//            imageurl : imgURL,
//            cost: cost
//
//        };
//         var proId = $(this).attr('producID');
//        var imgURL = $('#anhto-'+proId).find('img').attr('src');
//        var pName = $('#noidung-'+proId).children('.title').text();
//        var cost = $('#noidung-'+proId).children('.gia-tien').text();
//        
//     function AddtoCart() {
//     $('tbody').emtry();
//     var kiemtra = "";
//     for(var i =0; i < cart.length; i++){
//        kiemtra += 
//              `<tr>
//                <td>${cart[i].id}</td>
//                <td>${cart[i].productName}</td>
//                <td><img src ="${cart[i].imageurl}" alt =""></td>
//              </tr>
//
//              `; 
//     }
//     $('tbody').append(kiemtra);
//   };
