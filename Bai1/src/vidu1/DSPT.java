
package vidu1;
import java.util.Scanner;
public class DSPT {
    private PTGT[] p;
    private int n;
    public DSPT(){
        n=0;
        p=new PTGT[100];
    }    
    public int getSoPT(){
        return n;
    }
    public PTGT[] getDS(){
        return p;
    }
    public void vietDS(){
        System.out.println("STT\tHang\tMau\tNam\tGia");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+"\t"+p[i].toString());
        }
    }
    public void nhap(){
        Scanner in=new Scanner(System.in);
        String hang,mau;
        int nam;
        double gia;
        while(true){
           System.out.print("Hang: ");
           hang=in.nextLine();
           hang=hang.toUpperCase();
           if(hang.matches("^[A-Z]{4}\\d{4}$"))
               break;
        }
        System.out.print("mau: ");
        mau=in.nextLine();
        System.out.print("nam: ");
        nam=Integer.parseInt(in.nextLine());
        System.out.print("gia: ");
        gia=Double.parseDouble(in.nextLine());
        p[n++]=new PTGT(hang, mau, nam, gia);
    }
    public void dsTheoNam(int nam){
        int dem=0;
        System.out.println("STT\tHang\tMau\tNam\tGia");
        for (int i = 0; i < n; i++) {
            if(p[i].getNam()==nam){
                dem++;
               System.out.println((i+1)+"\t"+p[i].toString());
            }
        }
        System.out.println("-------------------------");
        System.out.println("Tong PT:"+dem);
        
    }
    public void dsTheogia(double tugia,double dengia){
        int dem=0;
        System.out.println("STT\tHang\tMau\tNam\tGia");
        for (int i = 0; i < n; i++) {
            if((p[i].getGia()>=tugia)&&(p[i].getGia()<=dengia)){
                dem++;
               System.out.println((i+1)+"\t"+p[i].toString());
            }
        }
        System.out.println("-------------------------");
        System.out.println("Tong PT:"+dem);
    }

    private String[] getMau(){
        String[] t=new String[p.length];
        for (int i = 0; i < p.length; i++) {
            t[i]=p[i].getMau();
        }
        int c=t.length;
        for (int i = 0; i < t.length-1; i++) {
            for (int j = i+1; j < t.length; j++) {
                if(t[i].equalsIgnoreCase(t[j])){
                    t[j]="";
                    c--;
                }
            }
        }
        String[] m=new String[c];
        int cc=0;
        for (int i = 0; i < t.length; i++) {
            if(t[i]!="")
                m[cc++]=t[i];
        }
        return m;
    }
    
}
