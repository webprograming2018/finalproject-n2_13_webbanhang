<%-- 
    Document   : index
    Created on : Nov 10, 2018, 7:12:28 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" type="img/png" href="img/favicon.png">
  
	<title>Trang chủ</title>
         <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- khai báo cho reponsivte -->
  <!-- <link rel="stylesheet" type="text/css" href="reset.css"> -->
	<link rel="stylesheet" type="text/css" href="css/index.css">
  <!--<link rel="stylesheet" type="text/css" href="index-reponsive.css">-->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script type="text/javascript" language="javascript" src="javascrip-jquery.js"></script>
  <script type="text/javascript" src="jquery.elevatezoom.js"></script>
    </head>
    <body>
        <jsp:include page ="header.jsp"></jsp:include>
        <jsp:include page ="content.jsp"></jsp:include>
        <jsp:include page ="footer.jsp"></jsp:include>
    </body>
</html>
