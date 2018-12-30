<%-- 
    Document   : dang_ki
    Created on : Dec 26, 2018, 5:14:23 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <link rel="shortcut icon" type="img/png" href="img/favicon.png">
  
	<title>Đăng kí</title>
         <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- khai báo cho reponsivte -->
  <!-- <link rel="stylesheet" type="text/css" href="reset.css"> -->
	<link rel="stylesheet" type="text/css" href="css/dang_ki.css">
  <!--<link rel="stylesheet" type="text/css" href="index-reponsive.css">-->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script type="text/javascript" language="javascript" src="javascrip-jquery.js"></script>
  <script type="text/javascript" src="jquery.elevatezoom.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
      $(document).ready(function () {
           var x_timer;
           $("#email").keyup(function (e) {
                clearTimeout(x_timer);
                var user_name = $(this).val();
                x_timer = setTimeout(function () {
                    check_username_ajax(user_name);
                }, 1000);
                });
 
           function check_username_ajax(username) {
                $("#user-result").html('<img src="img_ajax/ajax-loader.gif" />');
                $.post('CheckEmailServlet', {'username': username}, function (data) {
                    $("#user-result").html(data);
                 });
           }
       });
</script>
    </head>
    <body>
        <jsp:include page ="header.jsp"></jsp:include>
        <div id="content">
            <div id="dangki">
                <form action="Dangki_Servelet" method="POST">
                <div>
                    <span class="word"> Username: </span>
                    <input type="text" placeholder="Nhập tên tài khoản..." id="email" name="email">
                    <span id="user-result"></span>
                </div>              
                <div>
                    <span class="word"> Password: </span>
                    <input type="password" placeholder="Nhập mật khẩu..." id="pass" name="pass">
                    <span id="user-result"></span>
                </div>
                    <input type="hidden" value="insert" name="command">
                    <input type="submit" value="Đăng kí">
                
                
            </form>
            </div>  
        </div>
        
        <jsp:include page ="footer.jsp"></jsp:include>
    </body>
</html>
