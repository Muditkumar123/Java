class MyThr extends Thread{
    MyThr(String name){
       super(name);
    }
    public void run(){
   int i=34;
        System.out.println("Thank you");
        //        while(true){
//            System.out.println("I am a thread");
//        }
    }
}
class MyThreadRunnable3 implements Runnable{
    public void run(){
        System.out.println("I am a thread 2 ");
    }
}

public class CHW_CH_13_Thread_constructor {
    public static void main(String[] args) {
    MyThr t1=new MyThr("Mudit");
    t1.start();
    MyThr t2=new MyThr("Ram");
    t2.start();
    MyThreadRunnable3 thread3=new MyThreadRunnable3();
    Thread t3=new Thread(thread3,"Thread 3");
        System.out.println("Id of thread t ="+t1.getId());
        System.out.println("Name of thread t ="+t1.getName());
        System.out.println("Id of thread t ="+t2.getId());
        System.out.println("Name of thread t ="+t2.getName());


    }
}
