
package BaiThi;

import java.io.Serializable;

/**
 *
 * @author Le Trung Thuc
 */
public class QLMuon implements Serializable{
    private String tTrang;
    private int soLuong,maBD,maS;

    public QLMuon() {
    }

    public QLMuon(int maBD, int maS, String tTrang, int soLuong) {
        this.maBD = maBD;
        this.maS = maS;
        this.tTrang = tTrang;
        this.soLuong = soLuong;
    }

    public int getMaBD() {
        return maBD;
    }

    public void setMaBD(int maBD) {
        this.maBD = maBD;
    }

    public int getMaS() {
        return maS;
    }

    public void setMaS(int maS) {
        this.maS = maS;
    }

    public String gettTrang() {
        return tTrang;
    }

    public void settTrang(String tTrang) {
        this.tTrang = tTrang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public Object[]  toObject(){
        return new Object[]{
           maBD,maS,tTrang,soLuong
        };
    }
}
