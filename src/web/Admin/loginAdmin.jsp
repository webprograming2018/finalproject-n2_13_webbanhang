

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng nhập Admin</title>
        <c:set var="root" value="${pageContext.request.contextPath}"/>
          <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
        <script src="${root}/js/jquery-1.11.1.min.js"></script>
    </head>
    <body>
        <div id="header">
	<div class="inHeaderLogin"></div>
</div>

<div id="loginForm">
	<div class="headLoginForm">
	Đăng nhập Quản trị
	</div>
	<div class="fieldLogin">
	<form method="POST" action="">
	<label>Admin</label><br>
	<input type="text" class="login"><br>
	<label>Pass</label><br>
	<input type="password" class="login"><br>
	<input type="submit" class="button" value="Login">
	</form>
	</div>
</div>
    </body>
</html>
