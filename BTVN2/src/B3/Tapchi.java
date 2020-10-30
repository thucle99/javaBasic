
package B3;
public class Tapchi extends TaiLieu{
    private int soph,thangph;
    public Tapchi(){
        super();
    }

    public Tapchi(String ma, String nxb, int sobanph,int soph, int thangph) {
        super(ma,nxb,sobanph);
        this.soph = soph;
        this.thangph = thangph;
    }
    public int getSoph() {
        return soph;
    }
    public void setSoph(int soph) {
        this.soph = soph;
    }

    public int getThangph() {
        return thangph;
    }

    public void setThangph(int thangph) {
        this.thangph = thangph;
    }
    public String toString(){
        return super.toString()+"\t"+soph+"\t"+thangph;
    }
}
