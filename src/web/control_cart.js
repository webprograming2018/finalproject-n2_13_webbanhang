
	// Định nghĩa một mảng các phần tử sẽ bỏ vào giỏ hàng
    var shoppingCartItems = [];
    var priceItem;
    var numberItem = 0;

    $(document).ready(function () {
        // Kiểm tra nếu đã có localStorage["shopping-cart-items"] hay chưa?
        if (localStorage["shopping-cart-items"] != null) {
            shoppingCartItems = JSON.parse(localStorage["shopping-cart-items"].toString());
        }

        // Hiển thị thông tin từ giỏ hàng
        // displayShoppingCartItems();
        displayTotal();
    }); 


    // Sự kiện click các button có class=".add-to-cart"
    $(".add-to-cart").click(function () {
        var button = $(this); // Lấy đối tượng button mà người dùng click
        var id = button.attr("id"); // id của sản phẩm là id của button
        var name = button.attr("data-name"); // name của sản phẩm là thuộc tính data-name của button
        var price = button.attr("data-price"); // price của sản phẩm là thuộc tính data-price của button
        var image = button.attr("data-image");
        var quantity = 1; // Số lượng


        var item = {
            id: id,
            name: name,
            price: price,
            image: image,
            quantity: quantity
        };

        var exists = false;
        if (shoppingCartItems.length > 0) {
            $.each(shoppingCartItems, function (index, value) {
                // Nếu mặt hàng đã tồn tại trong giỏ hàng thì chỉ cần tăng số lượng mặt hàng đó trong giỏ hàng.
                if (value.id == item.id) {
                    value.quantity++;
                    exists = true;
                    return false;
                }
            });
        }

        // Nếu mặt hàng chưa tồn tại trong giỏ hàng thì bổ sung vào mảng
        if (!exists) {
            shoppingCartItems.push(item);
        }

        // Lưu thông tin vào localStorage
        localStorage["shopping-cart-items"] = JSON.stringify(shoppingCartItems); 
        // Chuyển thông tin mảng shoppingCartItems sang JSON trước khi lưu vào localStorage
        // Gọi hàm hiển thị giỏ hàng
        //displayShoppingCartItems();
        displayTotal();

    });

    function displayTotal()  {
    	if (localStorage["shopping-cart-items"] != null) {
    		$.each(shoppingCartItems, function (index, item) {
    			numberItem++;	
    		});
    		alert(numberItem);
    	}
    }


    // Hiển thị giỏ hàng ra table
    function displayShoppingCartItems() {
        if (localStorage["shopping-cart-items"] != null) {
            shoppingCartItems = JSON.parse(localStorage["shopping-cart-items"].toString()); 
            // Chuyển thông tin từ JSON trong localStorage sang mảng shoppingCartItems.

            $("#table-products > tbody").html("");
            // Duyệt qua mảng shoppingCartItems để append từng item dòng vào table
            $.each(shoppingCartItems, function (index, item) {
                var htmlString = "";
                priceItem = item.price * item.quantity;
                htmlString += "<tr>";
                htmlString += "<td><img width='100px' height='100px' src='" + item.image + "'/></td>";
                htmlString += "<td>" + item.name + "</td>";
                htmlString += "<td style='text-align: right'>$" + item.price + "</td>";
                htmlString += "<td style='text-align: right'>" + item.quantity + "</td>";
                htmlString += "<td style='text-align: right'>$" + priceItem + "</td>";
                htmlString += "</tr>";

                $("#table-products > tbody:last").append(htmlString);

            });
        }
    }

