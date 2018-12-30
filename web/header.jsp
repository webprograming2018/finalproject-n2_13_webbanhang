<%-- 
    Document   : header
    Created on : Nov 10, 2018, 7:16:46 PM
    Author     : Dell
--%>


<%@page import="model.Taikhoan"%>
<%--<%@page import="javax.management.Query.div(ValueExp, ValueExp)"%>--%>
<%@page import="model.Item"%>
<%@page import="java.util.Map"%>
<%@page import="model.Giohang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Taikhoan users = null;
            if (session.getAttribute("user") != null) {
                users = (Taikhoan) session.getAttribute("user");
            }
            Giohang cart = (Giohang) session.getAttribute("cart");
            if (cart == null) {
                cart = new Giohang();
                session.setAttribute("cart", cart);
            }

        %>
        <div id="header">
            <div class="top-header">
                <ul>
                    <%if (users != null) {%>
                    <li class="li_2">Chào mừng: 
                        <span style="font-weight: bold; font-size: 16px;"><%=users.getUserEmail()%></span>
                    </li>
                    <li>                      
                        <form action=" " method="POST">
                            <input type="hidden" value="out" name="command">
                            <input type="submit" style="margin-top:40px; background-color:#34ce57; border-radius: 10px; width: 100px; " value="Thoát">
                        </form>
                    </li>
                    <%}%>
                    <!--          <li class="li_3">
                                <label for="font">Font chữ</label>
                                <select name="font" id="font">
                                  <option value="Time New Roman">Time New Roman</option>
                                  <option value="Arial" selected>Arial</option>
                                </select>
                              </li>
                              <li class="li_4">
                                <label for="color">Màu sắc</label>
                                <select name="color" id = "color">
                                  <option value="black">Black</option>
                                  <option value="orange">Orange</option>
                                </select>
                              </li>-->
                    <%if (users == null) {%>
                    <li class="li_1">
                        <button class="btn btn-lg btn-success" id="login1"><a href="dang_nhap.jsp">Ðăng Nhập</a></button>

                    </li>
                    <li> <button class="btn btn-lg btn-success" id="register" style="margin-left: 50px;"><a href="dang_ki.jsp">Ðăng kí</a></button></li>         
                        <%}%>
                </ul>
            </div> 
            <div class="logo"><a href="#"><img src="img\logo\logo.png"></a></div>
            <div class="right_header" >
                <form action="">
                    <input class="inputSearch" type="text" placeholder=" Tìm kiếm sản phẩm..." 
                           name="text_search">
                    <div class="resultSearch" id="resultSearch">
                        <h4>Tìm thấy <b></b> Sản phẩm</h4>
                        <div class="kq">
                            <!--                                        <a href="#">
                                                                        <img src="img/product/pro-1.jpg" alt="">
                                                                            <span>sản phẩm 1</span>
                                                                            <span>$20</span>
                                                                    </a>-->
                        </div>
                    </div>
                    <button type="submit"><b class="fa fa-search"></b></button>

                </form>
                <div class="right_header_giohang">

                    <form action="">
                        <img src="img\icon-img\cart.png" id="gh_open">

                        <div class="showcart">
                            <%for (Map.Entry<Long, Item> list : cart.getCartItem().entrySet()) {%>
                            <ul>
                                <li><%=list.getValue().getSanpham().getTensp()%> </li>
                                <li>(x<%=list.getValue().getSoluong()%>)</li>
                                <li>:     $<%=list.getValue().getSanpham().getGiasp()%></li>
                                <!--<li><a href="Cart_Servlet?command=remove&ID=<%=list.getValue().getSanpham().getIdsp()%>">X</a></li>-->
                            </ul>
                            <%
                                }
                            %>
                            <div class="totalcost">Tổng giá : $<%=cart.TotalCart()%></div>
                            <div class="button-send">
                                <button class="close_cart">Đóng</button>
                                <a href="index.jsp">Xem giỏ hàng</a>
                            </div>
                        </div>

                        <b>CART: <%=cart.CountItem()%></b><br>

                    </form>

                </div>

            </div>
            <div class="Menu" >
                <ul>
                    <li><a href="index.jsp">Trang Chủ</a></li>
                    <li><a href="danh_sach_san_pham.jsp">Sản Phẩm</a></li>
                    <li><a href="giohang.jsp">Giỏ Hàng</a></li>
                    <li><a href="dang_ki_tai_khoan.html">Tài Khoản</a></li>
                    <li><a href="">Tư Vấn</a></li>
                    <li><a href="">Giới Thiệu</a></li>
                    <li><a href="">Liên Hệ</a></li>
                </ul>
            </div>

        </div>
        <!-- keo len top -->
        <div class="sec-1">
            <a href="javascript:void(0)" id="scrolltop" class="up-top">
                <img src="img\icon-img\menu.png"></a>
        </div>
    </body>
</html>
