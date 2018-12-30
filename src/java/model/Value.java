
package model;


public class Value {
    private String ten;
    private int chiso;

    public Value() {
    }

    public Value(String ten, int chiso) {
        this.ten = ten;
        this.chiso = chiso;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getChiso() {
        return chiso;
    }

    public void setChiso(int chiso) {
        this.chiso = chiso;
    }

    @Override
    public String toString() {
        return  ten ;
    }
    
}
