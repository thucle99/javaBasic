
package B2;
public class Oto extends PTGT{
    private String kdt;
    private int socho;
    public Oto(){
        super();
    }

    public Oto(String hang,String mau,double gia,int nam,String kdt, int socho) {
        super(hang,mau,gia,nam);
        this.kdt = kdt;
        this.socho = socho;
    }

    public String getKdt() {
        return kdt;
    }

    public void setKdt(String kdt) {
        this.kdt = kdt;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }
    
    public String toString(){
        return super.toString()+"\t"+kdt+"\t"+socho;
    }
}
