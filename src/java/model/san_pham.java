 
package model;


public class san_pham {
    private long idsp;
    private String tensp;
    private String anhsp;
    private double giasp;
    
    public san_pham(){
        
    }
     public san_pham(long idsp, String tensp, String anhsp, double giasp) {
        this.idsp = idsp;
        this.tensp = tensp;
        this.anhsp = anhsp;
        this.giasp = giasp;
    }
    
    

    public long getIdsp() {
        return idsp;
    }

    public void setIdsp(long idsp) {
        this.idsp = idsp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getAnhsp() {
        return anhsp;
    }

    public void setAnhsp(String anhsp) {
        this.anhsp = anhsp;
    }

    public double getGiasp() {
        return giasp;
    }

    public void setGiasp(double giasp) {
        this.giasp = giasp;
    }

   

  
}
