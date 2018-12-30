/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Thang;

/**
 *
 * @author Dell
 */
public class BieudoTServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String month = request.getParameter("month");
         String month1 ="2018-12";
        ArrayList<Thang> map = (new  BieudoTDAO()).bieudoThang(month1);
        HttpSession session = request.getSession();
        session.setAttribute("month", map);
        response.sendRedirect("/Lap_trinh_web/Admin/indexAdmin.jsp");
     
    }

}
