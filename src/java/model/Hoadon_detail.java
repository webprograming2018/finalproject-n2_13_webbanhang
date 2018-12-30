
package model;


 
public class Hoadon_detail {
    
    private long IDbill;
    private long IDproduct;
    private double price;
    private int quantity;
    private String datedetail;

    public Hoadon_detail() {
    }

    public Hoadon_detail(long IDbill, long IDproduct, double price, int quantity, String datedetail) {
        this.IDbill = IDbill;
        this.IDproduct = IDproduct;
        this.price = price;
        this.quantity = quantity;
        this.datedetail = datedetail;
    }

    public long getIDbill() {
        return IDbill;
    }

    public void setIDbill(long IDbill) {
        this.IDbill = IDbill;
    }

    public long getIDproduct() {
        return IDproduct;
    }

    public void setIDproduct(long IDproduct) {
        this.IDproduct = IDproduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDatedetail() {
        return datedetail;
    }

    public void setDatedetail(String datedetail) {
        this.datedetail = datedetail;
    }

  
    
}
