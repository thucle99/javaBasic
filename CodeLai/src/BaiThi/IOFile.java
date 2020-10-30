
package BaiThi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class IOFile {
    public static void vietFile(List a,String s){
        try{
            ObjectOutputStream f=new ObjectOutputStream(new FileOutputStream(s));
            for(Object i:a){
                f.writeObject(i);
            }
            f.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static void docFile(List a,String s){
        a.clear();
        try{
            ObjectInputStream f=new ObjectInputStream(new FileInputStream(s));
            Object o=null;
            while((o=f.readObject())!=null){
                a.add(o);
            }
            f.close();
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
