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
        <title>Biểu đồ hóa đơn</title>
        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
<!--        <script src="${root}/js/jquery-1.11.1.min.js"></script>-->
         <script type="text/javascript" src="https://www.google.com/jsapi"></script>
         <script type="text/javascript">
            // Load the Visualization API and the piechart package.
            google.load('visualization', '1', {'packages': ['columnchart']});

            // Set a callback to run when the Google Visualization API is loaded.
            google.setOnLoadCallback(drawChart);

            // Callback that creates and populates a data table,
            // instantiates the pie chart, passes in the data and
            // draws it.
            function drawChart() {

                // Create the data table.    
                var data = google.visualization.arrayToDataTable([
                    ['Country', 'Area(square km)'],
                    
                    <c:forEach var ="item" items="${listValue}">['${item.ten}',${item.chiso}],</c:forEach> 
                   
                ]);
                // Set chart options
                var options = {
                    'title': 'Biểu đồ số sản phẩm đã bán ra',
                    is3D: true,
                    pieSliceText: 'label',
                    tooltip: {showColorCode: true},
                    'width': 700,
                    'height': 300
                };

                // Instantiate and draw our chart, passing in some options.
                var chart = new google.visualization.PieChart(document.getElementById('Chart'));
                chart.draw(data, options);
            }
        </script>
    </head>
    <body>
     
        <jsp:include page ="headerAdmin.jsp"></jsp:include>
         <div id="wrapper">
            <div id="leftBar">
	<ul>
		<li><a href="Admin/indexAdmin.jsp">Trang chủ</a></li>
		<li><a href="Admin/qlsanpham.jsp"> Sản Phẩm</a></li>
                <li><a href="Admin/qltaikhoan.jsp"> Tài Khoản</a></li>
                <li><a href="Admin/qlhoadon.jsp"> Hóa đơn</a></li>
		<li><a href="${root}/Lap_trinh_web/ChartServelet">Thống kê</a></li>
	</ul>
	</div>
            <div id="rightContent">
            <h3>Biểu đồ hóa đơn</h3>
	
	
		<table class="data">
			<div id="Chart"></div>
		</table>
            
	</div>
<div class="clear"></div>
            <jsp:include page ="footerAdmin.jsp"></jsp:include>
        </div>
        
        
    </body>
</html>
