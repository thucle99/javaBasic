
package Bai4;
public class ThiSinh {
    private String sobaodanh,hoten;
    private double toan,ly,hoa;

    public ThiSinh(String sobaodanh, String hoten, double toan, double ly, double hoa) {
        this.sobaodanh = sobaodanh;
        this.hoten = hoten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public ThiSinh(String sobaodanh){
        this.sobaodanh=sobaodanh;
        hoten="";
        toan=0.0;
        ly=0.0;
        hoa=0.0;
    }
    ThiSinh() {
    }
    public String getSobaodanh() {
        return sobaodanh;
    }

    public void setSobaodanh(String sobaodanh) {
        this.sobaodanh = sobaodanh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
    public String toStrinh(){
        return sobaodanh+"\t"+hoten+"\t"+toan+"\t"+ly+"\t"+hoa;
    }
}
