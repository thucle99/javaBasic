
package Bai2;

import java.io.Serializable;

public class MonHoc implements Serializable{
    private String ten,loaiMon;
    private int tongTiet,ma;

    public MonHoc() {
    }

    public MonHoc(int ma,String ten,  int tongTiet ,String loaiMon) {
        this.ten = ten;
        this.loaiMon = loaiMon;
        this.tongTiet = tongTiet;
        this.ma = ma;
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoaiMon() {
        return loaiMon;
    }

    public void setLoaiMon(String loaiMon) {
        this.loaiMon = loaiMon;
    }

    public int getTongTiet() {
        return tongTiet;
    }

    public void setTongTiet(int tongTiet) {
        this.tongTiet = tongTiet;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,tongTiet,loaiMon
        };
    }
}
