<%-- 
    Document   : indexAdmin
    Created on : Dec 28, 2018, 2:15:36 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ Quản lý</title>
        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
        <script src="${root}/js/jquery-1.11.1.min.js"></script>
    </head>
    <body>
        <jsp:include page ="headerAdmin.jsp"></jsp:include>
         <div id="wrapper">
            <jsp:include page ="menuAdmin.jsp"></jsp:include>
            <jsp:include page ="contentAdmin.jsp"></jsp:include>
            <jsp:include page ="footerAdmin.jsp"></jsp:include>
        </div>
        
        
    </body>
</html>
