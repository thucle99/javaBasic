
package B7;

import B47.*;
import java.io.Serializable;


public class Student implements Serializable{
   private String ma,ten;
   private int tuoi;
   private double diem;

    public Student() {
    }

    public Student(String ma, String ten, int tuoi, double diem) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
   public Object[] toObject(){
       return new Object[]{
         ma,ten,tuoi,diem
       };
   }
}
