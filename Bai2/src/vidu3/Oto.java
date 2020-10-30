
package vidu3;
public class Oto extends PTGT {
    //kiểu động cơ, số chỗ ngỗi
    private String kdc;
    private int socho;
    public Oto(){
        super(); // goi ra ham tao cua lop cha
    }
    public Oto(String hang,int nam,String mau,double gia,String kdc,int socho){
        super(hang, nam, mau, gia); // goi ra lop cha
        this.kdc=kdc;
        this.socho=socho;
    }

    public String getKdc() {
        return kdc;
    }

    public void setKdc(String kdc) {
        this.kdc = kdc;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }
    public String toString(){
        return super.toString()+"\t"+kdc+"\t"+socho;
    }
}
