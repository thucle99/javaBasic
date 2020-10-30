/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.io.Serializable;

/**
 *
 * @author Le Trung Thuc
 */
public class NhanVien implements Serializable{
    private int ma;
    private  String ten,dc,sdt;
    private int bacLuong;

    public NhanVien() {
    }

    public NhanVien(int ma, String ten, String dc, String sdt, int bacLuong) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.sdt = sdt;
        this.bacLuong = bacLuong;
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

    public int getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(int bacLuong) {
        this.bacLuong = bacLuong;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,sdt,dc,bacLuong
        };
    }
}
