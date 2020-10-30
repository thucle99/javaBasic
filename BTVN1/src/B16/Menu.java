
package B16;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        duongtron dt=new duongtron();
        while(true){
            int lc;
            Scanner in=new Scanner(System.in);
            System.out.println("1.Nhap r");
            System.out.println("2.Tinh chu vi");
            System.out.println("3.Tinh dien tich");
            System.out.println("4.Tinh the tich");
            System.out.println("0.Thoat");
            System.out.print("Nhap lua chon cua ban:");
            lc=in.nextInt();
            switch(lc){
                case 1:
                    dt.nhap();
                    break;
                case 2:
                    dt.chuvi();
                    break;
                case 3:
                    dt.dientich();
                    break;
                case 4:
                    dt.thetich();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Chi nhap vao tu 0 den 4");
            }
        }
    }
}
