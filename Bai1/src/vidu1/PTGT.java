
package vidu1;

public class PTGT {
   //hãng sản xuất, năm sản xuất, giá bán, màu
   private String hang,mau;
   private int nam;
   private double gia;
   //hàm tạo

    public PTGT() {
    }

    public PTGT(String hang, String mau, 
            int nam, double gia) {
        this.hang = hang;
        this.mau = mau;
        this.nam = nam;
        this.gia = gia;
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

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public double getGiaBan(){
        return gia*3.2;
    }
   public String toString(){
       return hang+"\t"+mau+"\t"+nam+"\t"+gia;
   }
}
