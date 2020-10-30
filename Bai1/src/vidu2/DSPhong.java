
package vidu2;
import java.util.Scanner;

public class DSPhong {
     private PhongHoc[] ph;
     private int n;
     public DSPhong(){
         n=0;
         ph=new PhongHoc[100];
     }
     public void nhap(){
         Scanner in=new Scanner(System.in);
         String ma;
         int socho;
         boolean dhoa;
         System.out.print("Nhap ma:");
         String reg="^[1-9]{1}\\d{2}-A[1-3]{1}$";
         while(true){
             ma=in.nextLine();
             ma=ma.toUpperCase();
             if(ma.matches(reg))
                 break;
             System.out.print("nhap lai ma:");
         }
         System.out.print("So cho:");
         socho=Integer.parseInt(in.nextLine());
         System.out.print("Dieu hoa (true hoac false):");
         dhoa=Boolean.parseBoolean(in.nextLine());
         ph[n++]=new PhongHoc(ma, socho, dhoa);
     }
     public void vietDS(){
         System.out.println("Ma\tSo cho Dieu hoa");
         System.out.println("=====================");
         for (int i = 0; i < n; i++) {
             System.out.println(ph[i].toString());
         }
         System.out.println("======================");       
     }
     public void vietDStheoToa(String toa){
         System.out.println("Ma\tSo cho Dieu hoa");
         int count=0;
         System.out.println("=====================");
         for (int i = 0; i < n; i++) {
             if(ph[i].getToa().equalsIgnoreCase(toa)){
                System.out.println(ph[i].toString());
                count++;
             }
             
         }
         System.out.println("======================");
         System.out.println("Tong so phong:"+count);
     }
     
}
