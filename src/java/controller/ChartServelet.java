/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class ChartServelet extends HttpServlet {
    ChartValueDAO charDAO = new ChartValueDAO();

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            request.setAttribute("listValue", charDAO.getValues());
           
        } catch (SQLException ex) {
            Logger.getLogger(ChartServelet.class.getName()).log(Level.SEVERE, null, ex);
        }
         RequestDispatcher rd = getServletContext().getRequestDispatcher("/Admin/chartBill.jsp");
         rd.forward(request, response);
     
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

   
    

}
