<%-- 
    Document   : thanhtoan
    Created on : Dec 29, 2018, 2:33:31 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="${initParam['posturl']}" method="POST">
            <input type="hidden" name ="upload" value="1"/>
            <input type="hidden" name ="return" value="${initParam['returnurl']}"/>
            <input type="hidden" name ="cmd" value="_cart"/>
            <input type="hidden" name ="business" value="${initParam['business']}"/>
            <!--san pham 1-->
            <%  int a =0;
        String[] s = new String[100] ;
        String[] c = new String[100];
        String[] b= new String[100];
        String[] d= new String[100];
        for(int i=1; i<=4; i++){
            a++;
            s[i] = "item" +"_"+"name"+"_"+a;
            c[i] = "amount"+"_"+a;
            b[i] = "quantity"+"_"+a;
            d[i] = "sanpham"+a;
        
            %>
            <input type="hidden" name ="<%=s[i]%>" value="<%=d[i]%>"/>
            <input type="hidden" name ="<%=c[i]%>" value="10"/>
            <input type="hidden" name ="<%=b[i]%>" value="2"/>
      
            <%}%>
            <span>san pham 1// gia: 10 // so luong: 2</span>
            <span>san pham2// gia: 20 // so luong: 4</span>
            <span> tong gia: 100</span>
           <button class="btn btn-lg btn-success" id="button_paypal">
              Thanh toán paypal
            </button>
            
            
            
        </form>
    </body>
</html>
