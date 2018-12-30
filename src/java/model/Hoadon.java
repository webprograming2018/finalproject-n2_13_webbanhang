/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author Dell
 */
public class Hoadon {
    private long IDbill;
    private long IDuser;
    private double totalcart;
    private String payment;
    private String address;
    private Timestamp date;

    public Hoadon() {
    }

    public Hoadon(long IDbill, long IDuser, double totalcart, String payment, String address, Timestamp date) {
        this.IDbill = IDbill;
        this.IDuser = IDuser;
        this.totalcart = totalcart;
        this.payment = payment;
        this.address = address;
        this.date = date;
    }

    public long getIDbill() {
        return IDbill;
    }

    public void setIDbill(long IDbill) {
        this.IDbill = IDbill;
    }

    public long getIDuser() {
        return IDuser;
    }

    public void setIDuser(long IDuser) {
        this.IDuser = IDuser;
    }

    public double getTotalcart() {
        return totalcart;
    }

    public void setTotalcart(double totalcart) {
        this.totalcart = totalcart;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
    
    
}
