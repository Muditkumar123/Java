package com.company;
import java.util.Scanner;
public class CWH_05_TakingInpu {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Input the marks of 1st subject:");
        double a=s.nextDouble();
        System.out.print("Input the marks of 2nd subject:");
        double b=s.nextDouble();
        System.out.print("Input the marks of 3rd subject:");
        double c=s.nextDouble();
        System.out.print("Input the marks of 4th subject:");
        double d=s.nextDouble();
        System.out.print("Input the marks of 5th subject:");
        double e=s.nextDouble();
        double per=((a+b+c+d+e)/500)*100;
        System.out.print("Percentage=");
        System.out.print(per);

    }
}
