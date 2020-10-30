package vidu2;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        DSPhong ds=new DSPhong();
        while(true){
            System.out.println("1. Nhap 1 phong hoc");
            System.out.println("2. in ra ds");
            System.out.println("3. tim kiem theo toa nha");
            System.out.println("4. dua ra PT theo nam");
            System.out.println("5. Dua ra tu gia... den gia...");
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
                       System.out.print("nhap toa nha:");
                       String toa=in.nextLine();
                       ds.vietDStheoToa(toa);
                       break;
                case 4:
                       break;
                case 5:
                       break;
                case 0:System.out.println("bye!!!");
                       System.exit(0);
                       break;
                default:
                    System.out.println("chi chon 0->8");
            }
        }
    }
}
