
package N30_10;
//import java.io.Serializable;
public class Sach {
    private String ma,ten;
    private int soluong;
    private double gia;

    public Sach() {
    }

    public Sach(String ma, String ten, int soluong, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.soluong = soluong;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public Object[] toOBject(){
        return new Object[]{
            ma,ten,soluong,gia
        };
    }
}
