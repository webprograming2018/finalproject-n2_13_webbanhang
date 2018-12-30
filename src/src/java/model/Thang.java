
package model;


public class Thang {
    private String ma;
    private String ten;
    private String chiso;

    public Thang() {
    }

   

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChiso() {
        return chiso;
    }

    public void setChiso(String chiso) {
        this.chiso = chiso;
    }
     public Thang(String ma, String ten, String chiso) {
        this.ma = ma;
        this.ten = ten;
        this.chiso = chiso;
    }

    @Override
   public String toString() {
       return "Thang[ma="+ma+",ten="+ten+", chiso="+chiso+"]";
    }
    
}
