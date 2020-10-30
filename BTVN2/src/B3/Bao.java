
package B3;
public class Bao extends TaiLieu{
    private int ngayph;
    public Bao(){
        super();
    }

    public Bao(String ma, String nxb, int sobanph,int ngayph) {
        super(ma,nxb,sobanph);
        this.ngayph = ngayph;
    }

    public int getNgayph() {
        return ngayph;
    }

    public void setNgayph(int ngayph) {
        this.ngayph = ngayph;
    }
    public String toString(){
        return super.toString()+"\t"+ngayph;
    }
}
