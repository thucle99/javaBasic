
package B15;
import java.util.Scanner;
public class hoten {
    Scanner in=new Scanner(System.in);
    private String ten;
    public hoten(){
        ten=null;
    }
    public hoten(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public void nhap(){
        System.out.println("Nhap vao ho ten:");
        ten=in.nextLine();
    }
    public void xuat(){
        System.out.println("Xuat ra ten "+ten);
    }
    
    
}
