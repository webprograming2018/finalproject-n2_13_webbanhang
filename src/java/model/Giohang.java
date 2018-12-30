
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Giohang {
    private HashMap<Long , Item> cartItem;
    
    public Giohang(){
        cartItem = new HashMap<>();
    }

    public Giohang(HashMap<Long, Item> cartItem) {
        this.cartItem = cartItem;
    }

    public HashMap<Long, Item> getCartItem() {
        return cartItem;
    }

    public void setCartItem(HashMap<Long, Item> cartItem) {
        this.cartItem = cartItem;
    }
    // Thêm sản phẩm vào giỏ hàng
    public void AddtoCart(Long key, Item item){
        boolean check = cartItem.containsKey(key); // cho phep kiem tra trong cart
        if(check){
            int quantity_old = item.getSoluong();
            item.setSoluong(quantity_old +1);
            cartItem.put(key, item);
        }
        else{
            cartItem.put(key, item);
        }
    }
    // Bớt một sản phẩm trong giỏ hàng
    public void SubtoCart(Long key, Item item){
        boolean check = cartItem.containsKey(key);
        if(check){
            int quantity_old = item.getSoluong();
            if(quantity_old != 1){
                item.setSoluong(quantity_old -1);
                cartItem.put(key, item);  
            }
         
        }
       
    }
    
    // Xóa một sản phẩm ra khỏi giỏ hàng
    public void EdittoCart(Long key){
        boolean check = cartItem.containsKey(key);
        if(check){
            cartItem.remove(key);
        }
    }
    // Đếm tổng số Item
 
    public int CountItem(){
        return cartItem.size();
    }
    // Tính tổng số tiền của giỏ hàng
    public double TotalCart(){
        double dem =0;
//        cout = price * quantity
        for(Map.Entry<Long, Item> list : cartItem.entrySet()){
            dem += list.getValue().getSanpham().getGiasp() * list.getValue().getSoluong();
        }
        return dem;
    }
    public ArrayList<Double> Giaone(){
       double dem =0 ;
       ArrayList<Double> arr1 = new ArrayList<>();
       for(Map.Entry<Long, Item> list : cartItem.entrySet()){
            dem = list.getValue().getSanpham().getGiasp() * list.getValue().getSoluong();
            arr1.add(dem);
        }
       return arr1;
       
    }
//    public static void main(String[] args) {
//        Giohang giohang = new Giohang();
//        System.out.println("thanh cong !!!");
//        ArrayList<Double> arr1 = new ArrayList<>();
//       arr1 = giohang.Giaone();
//        for (Double double1 : arr1) {
//            System.out.println(double1);
//        }
//    }
}

