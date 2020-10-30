/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.io.Serializable;

/**
 *
 * @author Le Trung Thuc
 */
public class KhachHang implements Serializable{
    private int ma;
    private String  ten,dc,sdt;

    public KhachHang() {
    }

    public KhachHang(int ma, String ten, String dc, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,dc,sdt
        };
    }
}
