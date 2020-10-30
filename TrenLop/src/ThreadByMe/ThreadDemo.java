
package ThreadByMe;
public class ThreadDemo extends Thread{
    private int index=1;
    public ThreadDemo(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Start:"+getName());
        for(int i=0;i<=2;i++){
            System.out.println("Inside "+getName()+index++);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("End "+getName());
    }
}
