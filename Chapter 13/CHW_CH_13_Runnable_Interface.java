class MyThreadRunnable1 implements Runnable{
public void run(){
    System.out.println("I am a thread 1");
}
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a thread 2 ");
    }
}


public class CHW_CH_13_Runnable_Interface {
    public static void main(String[] args) {
    MyThreadRunnable1 bullet1=new MyThreadRunnable1();
        MyThreadRunnable2 bullet2=new MyThreadRunnable2();
    Thread gun1=new Thread(bullet1);
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
