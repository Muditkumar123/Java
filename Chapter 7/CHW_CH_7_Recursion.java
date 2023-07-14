package com.company;

public class CHW_CH_7_Recursion {
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }


    }



    public static void main(String[] args) {
        int n=6;
        int fac=factorial(6);
        System.out.println(fac);

    }
}
