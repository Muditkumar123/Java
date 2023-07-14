package com.company;
import java.util.*;
/*class MyEmployee{
   private int id;
    private String name;

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setid(int i){
        id=i;

    }

    public int getid(){
        return id;
    }

    }*/


class Circle{
    private double radius;
    private double area;
    private double perimeter;

    public void setRadius(double n){
        radius=n;
    }
    public double getradius() {
        return radius;
    }


    public void setArea(double n){
        area=n;
    }
    public double getarea() {
        return area;
    }
    public void setPerimeter(double n){
        perimeter=n;
    }
    public double getPerimeter() {
        return perimeter;
    }
}




public class CHW_CH_9_Accessmodifiers {
    public static void main(String[] args) {

     //   MyEmployee harry=new MyEmployee();
       // harry.id=123;
        //arry.name="Codewithharry"; throws error due to private
       // harry.setName("CodewithHarry");
        //harry.setid(123);
        ///System.out.println(harry.getName());
        //System.out.println(harry.getid());
       Circle c1=new Circle();
        Scanner sc= new Scanner(System.in);
        System.out.println("Input Radius,area,perimeter");
        double radius=sc.nextDouble();
        c1.setRadius(radius);
        double samplearea=sc.nextDouble();
        c1.setArea(samplearea);
        double sampleprimeter=sc.nextDouble();
        c1.setPerimeter(sampleprimeter);
        double area=3.14*Math.pow(radius,2);
        double perimeter=2*3.14*radius;
        if(area==c1.getarea()){
            System.out.println("Input area are equal");
        } else{
            System.out.println("Wrong area");
        }

        if(perimeter==c1.getPerimeter()){
            System.out.println("Input perimeter are equal");
        } else{
            System.out.println("Wrong perimeter");
        }


    }
}
