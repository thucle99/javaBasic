/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongThi {
    Scanner in=new Scanner(System.in);
    private String mapt,phongthi;
    private int soluong;
    private ArrayList<ThiSinh> list;

    public PhongThi(String mapt, String phongthi, int soluong) {
        this.mapt = mapt;
        this.phongthi = phongthi;
        this.soluong = soluong;
        list=new ArrayList<ThiSinh>();
    }
    public PhongThi() {
    }
    public boolean themts(){
        System.out.println("Nhap thong tin");
        System.out.print("Nhap sbd:");
        String sbd=in.nextLine();
        ThiSinh ts=new ThiSinh(sbd);
//        if(list.contains(sbd))   return false;
        System.out.print("Nhap vao ho va ten:");
        String ten=in.nextLine();
        ts.setHoten(ten);
        return list.add(ts);
    }
}
