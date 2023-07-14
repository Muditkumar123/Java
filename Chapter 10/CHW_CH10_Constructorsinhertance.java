class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }

    Base1(int x){
        System.out.println("I am a overloaded constructor with value of a as:"+x);
    }


}

class Derived1 extends Base1{

    Derived1(){
        //super(0);// base class ka argument wala constructor chlana h toh ye use krna hoga
        System.out.println("I am derived class constructor");
    }
 Derived1(int x,int y){
        super(x);
     System.out.println("I am a overloaded constructor of derived with value of b as:"+y);
 }


}

class ChildOfDerived extends  Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}






public class CHW_CH10_Constructorsinhertance {
    public static void main(String[] args) {
     // b= new Base1();//constructor class ka excecute hoga
    // Derived1 d=new Derived1(14,4);
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);


    }
}
