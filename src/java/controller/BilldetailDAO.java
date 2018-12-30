/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import conected.conect_db;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import model.Hoadon;
import model.Hoadon_detail;

/**
 *
 * @author Dell
 */
public class BilldetailDAO {
    public void addBilldetail(Hoadon_detail bd) throws SQLException{
        Connection conn = conect_db.getConnecttion();
        String sql = "INSERT INTO tbl_billdetail VALUES(?,?,?,?,?)";
        PreparedStatement ps = conn.prepareCall(sql);
        ps.setLong(1, bd.getIDbill());
        ps.setLong(2, bd.getIDproduct());
        ps.setDouble(3, bd.getPrice());
        ps.setInt(4, bd.getQuantity());
        ps.setString(5, bd.getDatedetail()); 
        ps.executeUpdate();
        
        
    }
//    public static void main(String[] args) throws SQLException {
//    Calendar cal = Calendar.getInstance();
//		Date t = cal.getTime();
//		SimpleDateFormat dfc = new SimpleDateFormat("dd/MM/yyyy");
//		String s = dfc.format(t)
//		 new BilldetailDAO().addBilldetail(new Hoadon_detail(1,1,1,1,s));
//              
//    }
}
