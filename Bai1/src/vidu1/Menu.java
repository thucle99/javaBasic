package vidu1;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        DSPT ds=new DSPT();
        while(true){
            System.out.println("1. Nhap 1 pt");
            System.out.println("2. in ra ds");
            System.out.println("3. so PT");
            System.out.println("4. dua ra PT theo nam");
            System.out.println("5. Dua ra tu gia... den gia...");
//            System.out.println("6. Dãy số nguyên tố");
//            System.out.println("7. BSCNN");
//            System.out.println("8. THuâng nguyên tố");
            System.out.println("0. Exit");
            System.out.print("Moi chon: ");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:ds.nhap();
                       break;
                case 2:ds.vietDS();
                       break;
                case 3:
                       System.out.println("So PT:"+ds.getSoPT());
                       break;
                case 4:System.out.print("nhap vao nam:");
                       int nam=in.nextInt();
                       ds.dsTheoNam(nam);
                       break;
                case 5:System.out.print("nhap vao tu gia:");
                       double gi1=in.nextDouble();
                       System.out.print("nhap vao den gia:");
                       double gi2=in.nextDouble();
                       ds.dsTheogia(gi1, gi2);
                       break;
//                case 6:h.daySoNgto();
//                       break;
//                case 7:System.out.println("BCNN:"+h.BSCNN());
//                       break;
//                case 8:if(h.thuanNgTo())
//                         System.out.println("dung");
//                       else
//                         System.out.println("sai");
//                       break;
//                       
                case 0:System.out.println("bye!!!");
                       System.exit(0);
                       break;
                default:
                    System.out.println("chi chon 0->8");
            }
        }
    }
}
