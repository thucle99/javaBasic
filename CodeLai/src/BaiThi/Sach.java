
package BaiThi;

import java.io.Serializable;

public class Sach implements Serializable{
    private String tenS,tacGia,chuyenNganh;
    private int namxb,soLuong,maS;
    public Sach() {
    }

    public Sach(int maS, String tenS, String tacGia, String chuyenNganh, int namxb, int soLuong) {
        this.maS = maS;
        this.tenS = tenS;
        this.tacGia = tacGia;
        this.chuyenNganh = chuyenNganh;
        this.namxb = namxb;
        this.soLuong = soLuong;
    }

    public int getMaS() {
        return maS;
    }

    public void setMaS(int maS) {
        this.maS = maS;
    }

    public String getTenS() {
        return tenS;
    }

    public void setTenS(String tenS) {
        this.tenS = tenS;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getNamxb() {
        return namxb;
    }

    public void setNamxb(int namxb) {
        this.namxb = namxb;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public Object[]  toObject(){
        return new Object[]{
            maS,tenS,tacGia,chuyenNganh, namxb,soLuong
        };
    }
}
