


<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="model.Value"%>
<%@page import="java.util.Map"%>
<%@page import="controller.BieudoTDAO"%>
<%@page import="model.Thang"%>
<%@page import="model.Hoadon"%>
<%@page import="controller.BillDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hinh thuc thong ke</title>
        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
        <script src="${root}/js/jquery-1.11.1.min.js"></script>
    </head>
    <body>


        <%
//                     ArrayList<Thang> mapTS = new ArrayList<Thang>();
            ArrayList<Thang> mapTS = (ArrayList<Thang>) session.getAttribute("month");
        %>		

        <jsp:include page ="headerAdmin.jsp"></jsp:include>


            <div id="wrapper">
            <jsp:include page ="menuAdmin.jsp"></jsp:include>
                <div id="rightContent">
                    <h3>Quản lý hóa đơn</h3>

                    <form action="BieudoTServlet" method="POST">
                        <input type="month" name="month">
                        <input type="submit" name="Gui">
                    </form>

                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data">Tên sản phẩm</th>
                            <th class="data">Số lượng bán ra</th>

                        </tr>
                    <%
                    if (mapTS != null) {
                            int count = 0;
                            for (Thang ts : mapTS) {
                                count++;
                    %>     
                    <tr class="data">
                        <td class="data" width="30px"><%=count%></td>
                        <td class="data"><%=ts.getTen()%></td>
                        <td class="data"><%=ts.getChiso()%></td>				
                    </tr>   
                    <%}%>

                    <%}%>
                </table>
            </div>
            <div class="clear"></div>
            <jsp:include page ="footerAdmin.jsp"></jsp:include>
        </div>


    </body>
</html>
