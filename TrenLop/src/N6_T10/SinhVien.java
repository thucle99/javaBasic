
package N6_T10;

public class SinhVien {
    private String ma,que,ten;
    private double  diem;

    public SinhVien() {
    }
    
    public SinhVien(String ma, String que, String ten, double diem) {
        this.ma = ma;
        this.que = que;
        this.ten = ten;
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    public Object[] Them(){
        return new Object[]{ma,que,diem,ten};
    }
}
