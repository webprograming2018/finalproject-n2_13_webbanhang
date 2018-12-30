/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Giohang;
import model.Taikhoan;
import tool.MD5;

/**
 *
 * @author Dell
 */
public class Dangki_Servelet extends HttpServlet {

    TaikhoanDAO userDAO = new TaikhoanDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String command = request.getParameter("command");
        String url = "";
        Taikhoan user = new Taikhoan();
        HttpSession session = request.getSession();
        Giohang cart = new Giohang();
        switch (command) {
            // Đăng kí
            case "insert":
                user.setUserID(new java.util.Date().getTime());
                user.setUserEmail(request.getParameter("email"));
                user.setUserPass(MD5.encryption(request.getParameter("pass")));
                user.setRole(false);
                userDAO.addTK(user);
                session.setAttribute("user", user);
                url = "/index.jsp";
                break;
            // Đăng nhập
            case "login":
                user = userDAO.login(request.getParameter("email"), MD5.encryption(request.getParameter("pass")));
                if (user != null && cart == null) {
                    session.setAttribute("user", user);
                    url = "/checkout.jsp";
                } else if (user != null && cart != null) {
                    session.setAttribute("user", user);
//                    request.setAttribute("error", "Lỗi đăng nhập !!");
                    url = "/index.jsp";
                }
                break;
            case "out":
                session.invalidate();
                url = "/index.jsp";
                break;
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);

    }

}
