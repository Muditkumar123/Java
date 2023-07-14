package com.company;
import java.util.Scanner;
public class CHW_Ch3_Practiceset {
    public static void main(String[] args) {
     //Question 1
        Scanner sc=new Scanner(System.in);
     //   System.out.printf("Input your string:");
    //String sample=sc.nextLine();
      //  System.out.println("Lower case String:"+sample.toLowerCase());

        //Question 2
       // System.out.println("Enter string with spaces between each word");
       // String question2=sc.nextLine();
      //  System.out.println("Spaces replaced by _ :" + question2.replace( " ", "_") );

        // Question 3
        System.out.print("Input your name:");
        String name=sc.nextLine();
       String letter = "Dear <|name|>, Thanks a lot";
      letter= letter.replace("<|name|>","Mudit");
        System.out.println(letter);

        String sample="This contain now  Space and now   triple space";
        System.out.println(sample.indexOf("  "));
        System.out.println(sample.indexOf("   "));


    }
}
