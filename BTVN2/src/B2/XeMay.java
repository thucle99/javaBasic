
package B2;
public class XeMay extends PTGT{
    private int cs;
    XeMay(){
        super();
    }
    public XeMay(String hang,String mau,double gia,int nam,int cs) {
        super(hang,mau,gia,nam);
        this.cs = cs;
    }

    public int getCs() {
        return cs;
    }

    public void setCs(int cs) {
        this.cs = cs;
    }
    public String toString(){
        return super.toString()+"\t"+cs;
    }
}
