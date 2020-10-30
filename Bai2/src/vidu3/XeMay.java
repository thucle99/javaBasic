
package vidu3;


public class XeMay extends PTGT {
    private int csuat;
    public XeMay(){
        super();
    }
    public XeMay(String hang,int nam,String mau,double gia,int csuat){
        super(hang, nam, mau, gia);
        this.csuat=csuat;
    }

    public int getCsuat() {
        return csuat;
    }

    public void setCsuat(int csuat) {
        this.csuat = csuat;
    }
    public String toString(){
        return super.toString()+"\t"+csuat;
    }
}
