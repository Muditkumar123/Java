package com.company;

public class CHW_CH_7_Variable_arguements {
   // static int sum(int a,int b){
    //    return a+b;
   // }
   // static int sum(int a,int b,int c){
   //     return a+b+c;
  //  }
  ///  static int sum(int a,int b,int c,int d){
   //     return a+b+c+d;
  //  }

    static int sum( int ...arr){
        //int ... arr act as int[]arr;
        int sum1=0;
        for(int a:arr){
            sum1+=a;
        } return sum1;
    }



    public static void main(String[] args) {

        System.out.println("Sum of 1,2="+ sum(1,2));
        System.out.println("Sum of 1,2,3="+ sum(1,2,3));
        System.out.println("Sum of 1,2,3,4="+ sum(1,2,3,4));

    }
}
