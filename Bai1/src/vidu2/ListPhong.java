
package vidu2;
import java.util.ArrayList;
import java.util.Scanner;

public class ListPhong {
   private ArrayList<PhongHoc> list;
   public ListPhong(){
       list=new ArrayList<>();
   }
   public boolean nhap(){
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
         return list.add(new PhongHoc(ma, socho, dhoa));
     }
     public void vietDS(){
         System.out.println("Ma\tSo cho Dieu hoa");
         System.out.println("=====================");
         for (int i = 0; i < list.size(); i++) {
             System.out.println(list.get(i).toString());
         }
//         for(PhongHoc i:list)
//             System.out.println(i.toString());
         System.out.println("======================");       
     }
}
