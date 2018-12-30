/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import conected.conect_db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Value;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author Dell
 */
public class ChartValueDAO {
   
    public ArrayList<Value> getValues() throws SQLException{
        Connection conn = conect_db.getConnecttion();
        String sql = 
        "SELECT ten_sp, SUM(soluong) "
                + "FROM tbl_sanpham, tbl_billdetail "
                + "WHERE tbl_sanpham.id_sp = tbl_billdetail.id_sp "
                + "GROUP BY tbl_billdetail.id_sp";
        PreparedStatement ps = conn.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Value> list = new ArrayList();
        while(rs.next()){
            Value v = new Value();
            v.setTen(rs.getString("ten_sp"));
            v.setChiso(rs.getInt("SUM(soluong)"));
            list.add(v);
                     
        }
        return list;
    }
    public static void main(String[] args) throws SQLException {
        System.out.println(new ChartValueDAO().getValues());
        for(Value v : new ChartValueDAO().getValues()){
            System.out.println(v.getTen() + "="+v.getChiso());
        }
    }
}
