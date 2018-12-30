
package controller;

import conected.conect_db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Taikhoan;
//import jdk.internal.instrumentation.Logger;


public class TaikhoanDAO {
    // Kiểm tra đăng nhập
    public boolean checkEmail(String email){
        Connection conn = conect_db.getConnecttion();
        String sql = "SELECT * FROM tbl_taikhoan WHERE user_email ='"+email+"'";
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                conn.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaikhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    
}
    // Thêm tài khoản 
    public boolean addTK(Taikhoan tk ){
        Connection conn = conect_db.getConnecttion();
        String sql = "INSERT INTO tbl_taikhoan VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareCall(sql); 
            ps.setLong(1, tk.getUserID());
            ps.setString(2, tk.getUserEmail());
            ps.setString(3, tk.getUserPass());
            ps.setBoolean(4, tk.isRole());
            ps.executeUpdate();
            return true;
          
        } catch (SQLException ex) {
            Logger.getLogger(TaikhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    // Kiểm tra đăng nhập
    

public Taikhoan login(String email, String pass) {
	Connection conn = conect_db.getConnecttion();
	String sql = "select * from tbl_taikhoan where user_email='" + email + "' and user_pass='" + pass + "'";
	PreparedStatement ps;
	try {
		ps = (PreparedStatement) conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
                    Taikhoan a = new Taikhoan();
                    a.setUserID(rs.getLong("id_user"));
                    a.setUserEmail(rs.getString("user_email"));
                    a.setUserPass(rs.getString("user_pass"));
                    a.setRole(rs.getBoolean("user_role"));
			conn.close();
			return a;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}

}
