<%-- 
    Document   : indexAdmin
    Created on : Dec 28, 2018, 2:15:36 PM
    Author     : Dell
--%>

<%@page import="model.Hoadon"%>
<%@page import="controller.BillDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý hóa đơn</title>
        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
        <script src="${root}/js/jquery-1.11.1.min.js"></script>
    </head>
    <body>
        <% 
            BillDAO bill  = new BillDAO();
        %>
        <jsp:include page ="headerAdmin.jsp"></jsp:include>
         <div id="wrapper">
            <jsp:include page ="menuAdmin.jsp"></jsp:include>
            <div id="rightContent">
            <h3>Quản lý hóa đơn</h3>
<!--	
	<div class="informasi">
	ini adalah notifikasi pertanda informasi
	</div>
	
	<div class="gagal">
	ini adalah notifikasi pertanda gagal
	</div>
	
	<div class="sukses">
	ini adalah notifikasi pertanda sukses
	</div>-->
		<table class="data">
			<tr class="data">
				<th class="data" width="30px">STT</th>
				<th class="data">Mã hóa đơn</th>
				<th class="data">Mã tài khoản</th>
				<th class="data">Tổng tiền</th>
                                <th class="data">Tên tài khoản</th>
                                <th class="data">Địa chỉ</th>
                                <th class="data">Ngày mua</th>
				<th class="data" width="60px">Tùy chọn</th>
			</tr>
                            <% int count =1;
                                for(Hoadon d: bill.getlistHD()){
                            %>
			<tr class="data">
				<td class="data" width="30px"><%=count++%></td>
				<td class="data"><%=d.getIDbill()%></td>
				<td class="data"><%=d.getIDuser()%></td>
				<td class="data"><%=d.getTotalcart()%></td>
                                <td class="data"><%=d.getPayment()%></td>
                                <td class="data"><%=d.getAddress()%></td>
                                <td class="data"><%=d.getDate()%></td>
				<td class="data" width="60px">
				<center>
				<a href="#"><img src="../img/admin/oke.png"></a>&nbsp;&nbsp;&nbsp;
				<a href="#"><img src="../img/admin/detail.png"></a>
				</center>
				</td>
			</tr>
                         <% }
                        %>
		</table>
	</div>
<div class="clear"></div>
            <jsp:include page ="footerAdmin.jsp"></jsp:include>
        </div>
        
        
    </body>
</html>
