
package Bai2;

import java.io.Serializable;

public class SinhVien implements Serializable{
   private String ten,dc,sdt;
   private int ma;

    public SinhVien() {
    }

    public SinhVien(int ma,String ten, String dc, String sdt) {
        this.ten = ten;
        this.dc = dc;
        this.sdt = sdt;
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

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,dc,sdt
        };
    }
}
