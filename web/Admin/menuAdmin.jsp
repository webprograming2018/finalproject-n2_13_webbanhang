<%-- 
    Document   : menuAdmin
    Created on : Dec 28, 2018, 2:21:03 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>
        <div id="leftBar">
	<ul>
		<li><a href="indexAdmin.jsp">Trang chủ</a></li>
		<li><a href="qlsanpham.jsp"> Sản Phẩm</a></li>
                <li><a href="qltaikhoan.jsp"> Tài Khoản</a></li>
                <li><a href="qlhoadon.jsp"> Hóa đơn</a></li>
		<li><a href="${root}/Lap_trinh_web/ChartServelet">Thống kê</a></li>
	</ul>
	</div>
    </body>
</html>
