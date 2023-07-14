import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "Im am toString() ";
    }

    @Override
    public String getMessage() {
        return "Im am getMessage()";
    }
}
public class CHW_CH_14_Exception_Class {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
          try {
              throw new MyException();
             // throw new ArithmeticException("This is an exception");
          }catch (Exception e) {
              System.out.println(e.getMessage());
              System.out.println(e.toString());
              e.printStackTrace();// error ki line btaega

          }

        }
        
    }
}
