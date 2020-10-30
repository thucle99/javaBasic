
package Bai4;

import java.io.Serializable;

public class NhanVien implements Serializable{
    private int ma;
    private String ten,dc,sdt;

    public NhanVien() {
    }

    public NhanVien(int ma, String ten, String dc, String sdt) {
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
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,dc,sdt
        };
    }
}
