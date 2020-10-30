//import.java.util.Date;
package Bai4;
public class PTGT {
    // hang sx,gia ban,năm sx,mau
    private String hang,nam,mau;
    private double gia;

    public PTGT(String hang, String nam, String mau, double gia) {
        this.hang = hang;
        this.nam = nam;
        this.mau = mau;
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
        
    }
    private int  a;
            
    public String toString(){
        return hang+"\t"+nam+"\t"+mau+"\t"+gia;
       
    }
    
}
