class MyNewThr1 extends Thread{

    public void run(){
    int i=0;
        while(true){
            System.out.println("Thank you Thread 1 ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyNewThr2 extends Thread{
    public void run(){
   int i=0;
        while(true){
            System.out.println("Thank you  Thread 2");
        i++;
        }
    }
}




public class CHW_CH_13_Thread_Methods {
    public static void main(String[] args) {
     MyNewThr1 t1=new MyNewThr1();
     MyNewThr2 t2=new MyNewThr2();
     t1.start();
//     try {
//        /*phle t1 start hoke khtm hoga and t2 start hoga t1 ke khtm hone ke bad */
//         t1.join();// will throw a error so we use try and catch method
//     }catch (Exception e){
//         System.out.println(e);
//     }

     t2.start();
    }
}
