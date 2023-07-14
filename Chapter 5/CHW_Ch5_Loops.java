import java.util.*;
public class CHW_Ch5_Loops {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        char choice;
        do{
            System.out.println("Input the number of rows you wanna print and the character in rohmbus:");
            int rows=sc.nextInt();
            char x=sc.next().charAt(0);
        for(int i=1;i<=rows;i++){
            for(int space=1;space<=rows-i;space++){
                System.out.printf(" ");
            }

            for(int star =1;star<=2*i-1;star++){
                System.out.printf("%c",x);
            }

            System.out.print("\n");
        }

        for(int i=rows;i>=1;i--){
            for(int space=1;space<=rows-i;space++){
                System.out.printf(" ");
            }

            for(int star =1;star<=2*i-1;star++){
                System.out.printf("%c",x);
            }

            System.out.print("\n");
        }
            System.out.println("Press Y for continue");
        choice=sc.next().charAt(0);

        }while(choice=='Y'||choice=='y');




















        }

    }

