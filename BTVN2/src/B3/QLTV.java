
package B3;

import java.util.ArrayList;
import java.util.Scanner;

public class QLTV {
    private ArrayList <TaiLieu> list;
    public QLTV(){
        list=new ArrayList<>();
    }
    public boolean tontaiSach(String ma){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getMa().equalsIgnoreCase(ma)) 
                return true;
        }
        return false ;
        
    }
    public TaiLieu nhap(){
        TaiLieu t=null;
        String ma,nxb;
        int sobanph;
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap ma:");
        while(true){
            ma=in.nextLine().toUpperCase();
            if(tontaiSach(ma)==false && ma.matches("^[A-Z]{2}\\d{3}$"))
                break;
            else System.out.print("nhap lai ma:");
        }
        System.out.print("Nhap nha xuat ban:");
        nxb=in.nextLine();
        System.out.print("Nhap so ban phat hanh:");
        sobanph=in.nextInt();
        t=new TaiLieu(ma,nxb,sobanph);
        return t;
    }
    public void nhapSach(){
        String tacgia,tensach;
        int sotrang;
        Scanner in=new Scanner(System.in);
        TaiLieu t=nhap();
        System.out.print("Tac gia:");
        tacgia=in.nextLine();
        System.out.print("Ten sach:");
        tensach=in.nextLine();
        System.out.print("So trang:");
        sotrang=in.nextInt();
        list.add(new Sach(t.getMa(),t.getNxb(),t.getSobanph(),tacgia,tensach,sotrang));
    }
    public void nhapBao(){
        int ngayph;
        TaiLieu t=nhap();
        Scanner in=new Scanner(System.in);
        System.out.print("Nhapngay phat hanh:");
        ngayph=in.nextInt();
        list.add(new Bao(t.getMa(),t.getNxb(),t.getSobanph(),ngayph));
    }
    public void nhapTapChi(){
        TaiLieu t=nhap();
        Scanner in=new Scanner(System.in);
        int thangph,soph;
        System.out.print("So phat hanh:");
        soph=in.nextInt();
        System.out.print("Thang phat hanh:");
        thangph=in.nextInt();
        list.add(new Tapchi(t.getMa(),t.getNxb(),t.getSobanph(),soph,thangph));
    }
    public void hienthi(){
        int dem1=0,dem2=0,dem3=0;
        System.out.println("========== Sach===");
        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof Sach){
                System.out.println(list.get(i).toString());
                dem1++;
            }
        }
        System.out.println("So sach la:"+dem1);
        System.out.println("========== Bao===");
        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof Bao){
                System.out.println(list.get(i).toString());
                dem2++;
            }
        }
        System.out.println("So bao la:"+dem2);
        System.out.println("========== Tap Chi===");
        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof Tapchi){
                System.out.println(list.get(i).toString());
                dem3++;
            }
        }
        System.out.println("So tap chi la:"+dem3);
    }
    public int timtheoma(String ma){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    public void sua(){
        System.out.print("Nhap ma  tai lieu can sua");
        Scanner in=new Scanner(System.in);
        String ma;
        ma=in.nextLine();
        int vt=timtheoma(ma);
        if(vt==-1)   System.out.println("Khong co de sua");
        else{
            String nxb;
            int sobanph;
            System.out.print("Nhap nha xuat ban:");
            nxb=in.nextLine();
            System.out.print("Nhap so ban phat hanh:");
            sobanph=in.nextInt();
            TaiLieu t=list.get(vt);
            t.setNxb(nxb);
            t.setSobanph(sobanph);
        }
    }
    public void xoa(){
        System.out.print("Nhap vao ma can xoa:");
        Scanner in=new Scanner(System.in);
        String ma;
        ma=in.nextLine();
        int vt=timtheoma(ma);
        if(vt==-1)  System.out.println("Khong can xoa");
        else{
            list.remove(vt);
        }
    }
}
