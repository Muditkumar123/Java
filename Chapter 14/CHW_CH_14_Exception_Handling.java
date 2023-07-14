import java.util.*;
public class CHW_CH_14_Exception_Handling {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int [] marks={7,56,6};
        System.out.println("Enter the array index");
        int ind=sc.nextInt();
        System.out.println("Enter the number you want to divide the value with:");
        int number=sc.nextInt();
        try {
            System.out.println("The value at array index ntered is:"+marks[ind]);
            System.out.println("The value of array-value/number is:"+marks[ind]/number);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException occured");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");

        }


    }
}
