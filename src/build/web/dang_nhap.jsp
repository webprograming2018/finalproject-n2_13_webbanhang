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
  
	<title>Đăng nhập</title>
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

    </head>
    <body>
        <jsp:include page ="header.jsp"></jsp:include>
        <div id="content">
            <div id="dangki">
                <form action="Dangki_Servelet" method="POST">
                <% if(request.getParameter("error")!=null){%>
                    <div>
                        <p style="color: red"><%=request.getParameter("error")%></p>
                    </div>
                <%}%>
                <div>
                    <span class="word"> Username: </span>
                    <input type="text" placeholder="Nhập tên tài khoản..." id="email" name="email">
                </div>              
                <div>
                    <span class="word"> Password: </span>
                    <input type="password" placeholder="Nhập mật khẩu..." id="pass" name="pass">
                    
                </div>
                    <input type="hidden" value="login" name="command">
                    <input type="submit" value="Đăng nhập" id="click_login">
                
                
            </form>
            </div>  
        </div>
        
        <jsp:include page ="footer.jsp"></jsp:include>
    </body>
</html>
