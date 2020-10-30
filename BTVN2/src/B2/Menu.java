
package B2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        QLPT ql=new QLPT();
        while(true){
            System.out.println("1. Nhap vao oto");
            System.out.println("2. Nhap vao xe may");
            System.out.println("3. Nhap xe tai");
            System.out.println("4. Hien thi ds PTGT");
            System.out.println("5. Xoa");
            System.out.println("6. Sua");
            System.out.println("0. Exit");
            System.out.print("Nhap lua chon cua ban:");
            int lc=in.nextInt();
            switch(lc){
                case 1:
                    ql.nhapOto();
                    break;
                case 2:
                    ql.nhapXeMay();
                    break;
                case 3:
                    ql.nhapXeTai();
                    break;
                case 4:
                    ql.hienthi();
                    break;
                case 5:
                    ql.xoa();
                    break;
                case 6:
                    ql.sua();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
