/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N30_10;
// doc
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//viet
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
public class IOFile {
    public static void vietFile(List ob,String s){
        try{
            ObjectOutputStream f=new ObjectOutputStream(new FileOutputStream(s));
            for(Object i:ob){
                f.writeObject(i);
            }
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    public static void docFile(List ob,String s) {
        ob.clear();
        try{
           ObjectInputStream f=new ObjectInputStream(new FileInputStream(s));
           Object o=null;
           while((o=f.readObject())!=null){
               ob.add(o);
           }
           f.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
