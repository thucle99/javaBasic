
package Bai4;

import java.util.Scanner;

public class MenuPT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(true){
            PhongThi pt=new PhongThi();
            System.out.println("1.Them thi sinh");
            System.out.println("2.Xoa thi sinh");
            System.out.println("3.Sua thi sinh");
            System.out.println("4.Lay thi sinh bang diem");
            System.out.println("5.Lay thi sinh bang ten");
            System.out.println("0.Thoat");
            System.out.print("Nhap lua chon cua ban:");
            int lc=in.nextInt();
            in.nextLine();
            switch(lc){
                case 1:
                    System.out.println(" "+pt.themts());
                   break;
//                case 2:
                    
            }
        }
    }
}
