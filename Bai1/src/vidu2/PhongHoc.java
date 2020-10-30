
package vidu2;


public class PhongHoc {
    //mã (3 số - A 1 số), . tòa nhà (không lấy ra mã) , 
    //số chỗ, có điều hòa 
    private String ma,toa;
    private int socho;
    private boolean dhoa;

    public PhongHoc() {
    }

    public PhongHoc(String ma, int socho, 
            boolean dhoa) {
        this.ma = ma;
        this.socho = socho;
        this.dhoa = dhoa;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }

    public boolean isDhoa() {
        return dhoa;
    }

    public void setDhoa(boolean dhoa) {
        this.dhoa = dhoa;
    }
    public String getToa(){
        return ma.substring(4);//602-A2
    }
    public String toString(){
        return ma+"\t"+socho+"\t"+(dhoa==true?"Co":"Khong");
    }
}
