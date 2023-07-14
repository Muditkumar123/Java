import java.util.ArrayList;
import java.util.LinkedList;

public class CHW_CH_15_Linklist_ii {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();//way of creating array of integersl1.add(6);
        LinkedList<Integer> l2=new LinkedList<>();
        l1.add(7);
        l1.add(6);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l1.addAll(l2);
        l1.addLast(14);//method differnt from arraylist,last me 12 add kiya
        l1.addFirst(13);//u know this

        // l1.clear();//sare elements remove kr diye
//        System.out.println(l1.contains(7));// boolean true
//        System.out.println(l1.indexOf(10));// returns index of 10
//        System.out.println(l1.indexOf(6));//returns first occurance
//        System.out.println(l1.lastIndexOf(6));//last occ........
//        l1.remove(0);//. remove the element form 0th index
//        System.out.println(l1.get(0));
//        l1.set(0,12);// 0th index pr 12 daldo

//   for( int i =0;i<l1.s
    }

}
