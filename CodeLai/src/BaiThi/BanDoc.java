
package BaiThi;

import java.io.Serializable;

public class BanDoc implements Serializable{
    private String HoTen,DiaChi,sdt;
    private int ma;
    public BanDoc() {
    }

    public BanDoc(int ma, String HoTen, String DiaChi, String sdt) {
        this.ma = ma;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public Object[]  toObject(){
        return new Object[]{
            ma,HoTen,DiaChi,sdt
        };
    }
}
