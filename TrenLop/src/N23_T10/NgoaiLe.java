/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N23_T10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NgoaiLe {
    public static void main(String[] args) throws ParseException {
        int x,y;
//        x=8;
//        y=2;
//        try{
//        int z=x/y;
//        System.out.println("Z="+z);
//        }catch(ArithmeticException e){
//            System.out.println(e);
//        }
//        System.out.println("Viec 1");
//        System.out.println("Viec 2");
        try{
        String snum="abcdfj";
        int num=Integer.parseInt(snum);
        }catch(NumberFormatException e){
            System.out.println(e);  
        }
        String d="25/07/1999";
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        Date dd=f.parse(d);
    }
}
