<%-- 
    Document   : chaydemo
    Created on : Dec 30, 2018, 11:20:46 AM
    Author     : Dell
--%>

<%@page import="controller.BieudoTDAO"%>
<%@page import="model.Thang"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Thống kê theo tháng</title>
    </head>
    <body>
        <div class="container">
     
        <%
            String thang= (String) session.getAttribute("month");
            Map<String,Thang> mapTS = new BieudoTDAO().bieudoThang(thang);		
        %>
        	<table id="datatable-buttons" class="table table-striped table-bordered">
                      <thead>
                        <tr>
                          <th>STT</th>
                          <th>Tên sp</th>
                          <th>Chi so</th>
                        </tr>
                      </thead>
                      <tbody>
                      <%int count=0;for(Thang ts : mapTS.values()){ count++;%>
           				 <TR>
               				 <TD> <%= count%></td>
               				 <TD> <%= ts.getTen()%></TD>
              				  <TD> <%= ts.getChiso() %></TD>
           				 </TR>
           				 <%} %>
                      </tbody>
                    </table>
        </div>
  
    </body>
</html>
