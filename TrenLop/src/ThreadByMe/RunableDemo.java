
package ThreadByMe;
public class RunableDemo implements Runnable{
    private int index=1;
    @Override
    public void run(){
        System.out.println("Start Runable");
        for(int i=0;i<=2;i++){
            System.out.println("InsideRunable"+index++);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("End Runable");
    }
}
