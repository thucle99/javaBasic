
package ThreadByMe;
public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main");
        for(int i=0;i<2;i++){
            System.out.println("Inside Main");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        ThreadDemo f=new ThreadDemo("Doan xem");
        f.start();
        try{
            f.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
        RunableDemo f1=new RunableDemo();
        Thread f2=new Thread(f1);
        f2.start();
        System.out.println("----Stop Main");
    }
}
