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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Thang;
import model.Value;

/**
 *
 * @author Dell
 */
public class BieudoTDAO {
    public static ArrayList<Thang> bieudoThang(String text){
        String year = text.substring(0,text.indexOf("-"));
	String month=text.substring(text.indexOf("-")+1, text.length());
//        Map<String, Thang> map = new HashMap<String,Thang>();
           ArrayList<Thang> list= new  ArrayList<>();
        try {
            Connection conn = conect_db.getConnecttion();
            String sql =  
                    "SELECT tbl_sanpham.id_sp, ten_sp, SUM(soluong) FROM tbl_bill, tbl_billdetail, tbl_sanpham\n" +
"WHERE tbl_sanpham.id_sp = tbl_billdetail.id_sp and tbl_bill.id_bill = tbl_billdetail.id_bill"
                + " and year(date)= '"+year+"' " +
"and month(date)= '"+month+"' GROUP BY tbl_billdetail.id_sp ";
            PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
              
                String ma  = rs.getString("id_sp");
                String tensp  = rs.getString("ten_sp");
                String chiso = rs.getString("SUM(soluong)");
                list.add(new Thang(ma, tensp, chiso));
//                map.put(ma,new Thang(ma,tensp,chiso));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi thong ke thang");
        }
        return list;
    }
    public static void main(String[] args) throws SQLException {
       String thang ="2018-12";
        System.out.println((new BieudoTDAO()).bieudoThang(thang));
//        System.out.println(new ChartMonthDAO().getValues());
//        for(Value v : new ChartMonthDAO().getValues()){
//            System.out.println(v.getTen() + "="+v.getChiso());
//        }
    }
}
