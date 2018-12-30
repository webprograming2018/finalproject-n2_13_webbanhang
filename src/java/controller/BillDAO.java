
package controller;

import conected.conect_db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import model.Hoadon;


public class BillDAO {
    public void addBill(Hoadon bill ) throws SQLException{
        Connection conn = conect_db.getConnecttion();
        String sql = "INSERT INTO tbl_bill VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareCall(sql);
        ps.setLong(1, bill.getIDbill());
        ps.setLong(2, bill.getIDuser());
        ps.setDouble(3, bill.getTotalcart());
        ps.setString(4, bill.getPayment());
        ps.setString(5, bill.getAddress());
        ps.setTimestamp(6, bill.getDate());
        ps.executeUpdate();
 
    }
     public ArrayList<Hoadon> getlistHD() throws SQLException{
        Connection connection = conect_db.getConnecttion(); // gọi hàm kết nối CSDL
        String sql = "SELECT * FROM tbl_bill"; // câu lệnh truy vẫn
        PreparedStatement ps = connection.prepareCall(sql); 
        ResultSet rs = ps.executeQuery(); // thực hiện câu lênh truy vấn 
        ArrayList<Hoadon> list = new ArrayList<>(); // khởi tạo một mảng để lưu những gì vừa lấy
        while(rs.next()){
            Hoadon hd = new Hoadon(); // khai báo sp phía model
            hd.setIDbill(rs.getLong("id_bill")); // lấy những gì trong CSDL gán vào sp_model tương ứng
            hd.setIDuser(rs.getLong("id_user"));
            hd.setTotalcart(rs.getDouble("totalcart"));
            hd.setPayment(rs.getString("account"));
            hd.setAddress(rs.getString("address"));
            hd.setDate(rs.getTimestamp("date"));
            list.add(hd); // thêm
        }
        return list; // trả lại
        
    }
    public static void main(String[] args) throws SQLException {
        new BillDAO().addBill(new Hoadon(0,0,0, "s","s", new Timestamp(new Date().getTime())));
    }
    
}
