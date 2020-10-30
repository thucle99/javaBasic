
package threaddemo;


public class ThreadDemo extends Thread {
    private int index;
    public ThreadDemo(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("start "+getName());
        for (int i = 0; i < 2; i++) {
            System.out.println("inside "+getName()+(index++));
            try{
               sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("the end "+getName());
    }
}
