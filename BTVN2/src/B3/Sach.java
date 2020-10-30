
package B3;
public class Sach extends TaiLieu{
    private String tacgia,tensach;
    private int sotrang;
    public Sach(){
        super();
    }
    public Sach(String ma, String nxb, int sobanph,String tacgia, String tensach, int sotrang) {
        super(ma,nxb,sobanph);
        this.tacgia = tacgia;
        this.tensach = tensach;
        this.sotrang = sotrang;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int socho) {
        this.sotrang = sotrang;
    }
    public String toString(){
        return super.toString()+"\t"+tacgia+"\t"+tensach+"\t"+sotrang;
    }
}
