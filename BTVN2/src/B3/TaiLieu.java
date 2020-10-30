
package B3;
public class TaiLieu {
    private String ma,nxb;
    private int sobanph;
    public TaiLieu(){}

    public TaiLieu(String ma, String nxb, int sobanph) {
        this.ma = ma;
        this.nxb = nxb;
        this.sobanph = sobanph;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSobanph() {
        return sobanph;
    }

    public void setSobanph(int sobanph) {
        this.sobanph = sobanph;
    }
    public String toString(){
        return ma+"\t"+nxb+"\t"+sobanph;
    }

    Object getMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
