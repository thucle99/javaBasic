
package vidu3;

/**
 *
 * @author Admin 88
 */
public class xetai extends PTGT{
    private int trongtai;
    xetai(){
        super();
    }
    public xetai(String hang, int nam, String mau, double gia,int trongtai){
        
        super();
        this.trongtai=trongtai;
    }

    public int getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(int trongtai) {
        this.trongtai = trongtai;
    }
    public String toString(){
        return super.toString()+"\t"+trongtai;
    }
}
