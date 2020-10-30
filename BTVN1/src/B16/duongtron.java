
package B16;

import java.util.Scanner;
public class duongtron {
    Scanner in=new Scanner(System.in);
    private int r;
    public duongtron(){
        r=0;
    }
    public void nhap(){
        System.out.print("Nhap r:");
        r=in.nextInt();
    }
    public void chuvi(){
        double C=2*r*Math.PI;
        System.out.println("Chu vi duong tron la:"+C);
    }
    public void dientich(){
        double S=r*r*Math.PI;
        System.out.println("Dien tich duong tron:"+S);
    }
    public void thetich(){
        double V=(4*r*r*r*Math.PI)/3;
        System.out.println("The tich duong tron :"+V);
    }
}
