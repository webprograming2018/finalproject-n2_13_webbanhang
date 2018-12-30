
package controller;

//import com.mysql.jdbc.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import conected.conect_db;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.san_pham;

/**
 *
 * @author Dell
 */
public class san_pham_DAO {
    // lấy sản phẩm từ CSDL và hiện lên jsp
    public ArrayList<san_pham> getlistSP() throws SQLException{
        Connection connection = conect_db.getConnecttion(); // gọi hàm kết nối CSDL
        String sql = "SELECT * FROM tbl_sanpham"; // câu lệnh truy vẫn
        PreparedStatement ps = connection.prepareCall(sql); 
        ResultSet rs = ps.executeQuery(); // thực hiện câu lênh truy vấn 
        ArrayList<san_pham> list = new ArrayList<>(); // khởi tạo một mảng để lưu những gì vừa lấy
        while(rs.next()){
            san_pham sp = new san_pham(); // khai báo sp phía model
            sp.setIdsp(rs.getLong("id_sp")); // lấy những gì trong CSDL gán vào sp_model tương ứng
            sp.setTensp(rs.getString("ten_sp"));
            sp.setAnhsp(rs.getString("anh_sp"));
            sp.setGiasp(rs.getDouble("gia_sp"));
            list.add(sp); // thêm
        }
        return list; // trả lại
        
    }
    // Dùng làm giỏ hàng
    public san_pham getSP(long idsp) throws SQLException{
        Connection connection = conect_db.getConnecttion();
        String sql = "SELECT * FROM tbl_sanpham WHERE id_sp = '"+idsp+"' ";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        san_pham product = new san_pham();
        while(rs.next()){
            
            product.setIdsp(rs.getLong("id_sp"));
            product.setTensp(rs.getString("ten_sp"));
            product.setAnhsp(rs.getString("anh_sp"));
            product.setGiasp(rs.getDouble("gia_sp"));
            
        }
        return product;
    }
    
//    public static void main(String[] args) throws SQLException {
//        san_pham_DAO dao = new san_pham_DAO();
//        
//            System.out.println(dao.getSP(2).getTensp());
//        
//    }
}
