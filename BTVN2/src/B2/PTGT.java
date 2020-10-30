
package B2;
public class PTGT {
    private String hang,mau;
    private double gia;
    private int nam;
    public PTGT(){
    }
    public PTGT(String hang, String mau, double gia, int nam) {
        this.hang = hang;
        this.mau = mau;
        this.gia = gia;
        this.nam = nam;
    }
    public String getHang() {
        return hang;
    }
    public void setHang(String hang) {
        this.hang = hang;
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
    public int getNam() {
        return nam;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }
    public String toString(){
        return hang+"\t"+mau+"\t"+gia+"\t"+nam;
    }
}
