
package B2;
import java.util.ArrayList;
import java.util.Scanner;
public class QLPT {
    private ArrayList<PTGT> list;
    public QLPT(){
        list=new ArrayList<>();
    }
    private PTGT nhap(){
        PTGT p=null;
        Scanner in=new Scanner(System.in);
        String hang,mau;
        double gia;
        int nam;
        System.out.print("Hang:");
        while(true){
            hang=in.nextLine();
            if(hang.matches("^[A-Za-z]{4}\\d{2}"))  break;
            else System.out.print("Nhap lai hang:");
        }
        System.out.print("Nhap mau:");
        mau=in.nextLine();
        System.out.print("Nhap nam:");
        while(true){
            nam=in.nextInt();
            if(nam>1500  && nam<2500)  break;
            else System.out.print("Nhap lai nam:");
        }
        System.out.print("Nhap gia:");
        gia=in.nextDouble();
        p=new PTGT(hang,mau,gia,nam);
        return p;
    }
    public void nhapXeMay(){
        PTGT p=nhap();
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap cong suat:");
        int cs=in.nextInt();
        list.add(new XeMay(p.getHang(),p.getMau(),p.getGia(),p.getNam(),cs));
    }
    public void nhapOto(){
        PTGT p=nhap();
        int socho;
        Scanner in=new Scanner(System.in);
//        in.nextLine();
        System.out.print("Nhap dong co:");
        String dongco=in.nextLine();
        System.out.print("Nhap so cho:");
//        int socho=in.nextInt();
         socho=in.nextInt();
        list.add(new Oto(p.getHang(),p.getMau(),p.getGia(),p.getNam(),dongco,socho));
    }
    public void nhapXeTai(){
        PTGT p=nhap();
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap trong tai:");
        int trongtai=in.nextInt();
        list.add(new XeTai(p.getHang(),p.getMau(),p.getGia(),p.getNam(),trongtai));
    }
    public void hienthi(){
        int dem1=0,dem2=0,dem3=0;
        System.out.println("=======oto====");
        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof Oto){   
                System.out.println(list.get(i).toString()); 
                dem1++;
            }
        }
        System.out.println("-So oto la:"+dem1);
        System.out.println("=========xe may====");
        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof XeMay){
                System.out.println(list.get(i).toString());
                dem2++;
            }
        }
        System.out.println("-so xe may la:"+dem2);
        System.out.println("======= xe tai=====");
        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof XeTai){
                System.out.println(list.get(i).toString());
                dem3++;
            }
        }
        System.out.println("-so xe tai la:"+dem3);
    }
    public int timtheoHang(String hang){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getHang().equalsIgnoreCase(hang))
            return i;
        }
            return -1;
    }
    public void xoa(){
        Scanner in=new Scanner(System.in);
        String hang;
        System.out.print("Nhap hang can xoa:");
        hang=in.nextLine();
        if(timtheoHang(hang)==-1)
            System.out.println("Khong can xoa");
        else
            list.remove(timtheoHang(hang));
    }
    public void sua(){
        String hang;
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap vao hang can sua:");
        hang=in.nextLine();
        int vitri=timtheoHang(hang);
        if(vitri==1)
            System.out.println("Khong can sua");
        else{
            String mau;
            int nam;
            double gia;
            PTGT p=list.get(vitri);
            System.out.print("Nhap vao mau:");
            mau=in.nextLine();
            System.out.print("Nam:");
            while(true){
                 nam=in.nextInt();
                 if(nam>1500  && nam<2500)   break;
                 System.out.print("Nhap lai nam:");
            }
            System.out.print("Gia:");
            gia=in.nextDouble();
            p.setMau(mau);
            p.setNam(nam);
            p.setGia(gia);
        }
    }
}
