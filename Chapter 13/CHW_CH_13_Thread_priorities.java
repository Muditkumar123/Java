import java.util.*;
class MyThr1 extends Thread{
    MyThr1(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("Thank you "+this.getName());
                while(true){
            System.out.println("I am a thread");
        }
    }
}
public class CHW_CH_13_Thread_priorities {
    public static void main(String[] args) {
    MyThr1 t1=new MyThr1("1");
    MyThr1 t2=new MyThr1("2");
    MyThr1 t3=new MyThr1("3");
    MyThr1 t4=new MyThr1("4");
    MyThr1 t5=new MyThr1("5 (most important)");
    t5.setPriority(Thread.MAX_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
   t5.start();










    }
}
