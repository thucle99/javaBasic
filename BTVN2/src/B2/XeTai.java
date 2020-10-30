
package B2;
public class XeTai extends PTGT{
    public int trongtai;
    public XeTai(){
        super();
    }

    public XeTai(String hang,String mau,double gia,int nam,int trongtai) {
        super(hang,mau,gia,nam);
        this.trongtai = trongtai;
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
