
package B3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        QLTV tv=new QLTV();
        while(true){
            System.out.println("1.Nhap 1 dau sach");
            System.out.println("2.Nhap 1 tap chi");
            System.out.println("3.Nhap 1 to bao");
            System.out.println("4.Xuat ra danh sach");
            System.out.println("5.Xoa");
            System.out.println("6.Sua");
            System.out.println("0.exit");
            System.out.print("Nhap lua chon cua ban:");
            int lc=in.nextInt();
            switch(lc){
                case 1:
                    tv.nhapSach();
                    break;
                case 2:
                    tv.nhapTapChi();
                    break;
                case 3:
                    tv.nhapBao();
                    break;
                case 4:
                    tv.hienthi();
                    break;
                case 5:
                    tv.xoa();
                    break;
                case 6:
                    tv.sua();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("chi nhap tu 0 den 6");
            }
        }
    }
}
