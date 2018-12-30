
package model;


public class Item {
    private san_pham product;
    private int soluong;
    
    public Item(){
        
    }

    public Item(san_pham sanpham, int soluong) {
        this.product = sanpham;
        this.soluong = soluong;
    }

    public san_pham getSanpham() {
        return product;
    }

    public void setSanpham(san_pham sanpham) {
        this.product = sanpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    
}
