import  java.util.*;
public class CHW_CH_15_Hashset_iv {
    public static void main(String[] args) {
        HashSet<Integer> myHashset = new HashSet<Integer>(6,0.5f);
        myHashset.add(6);
        myHashset.add(7);
        myHashset.add(8);
        myHashset.add(8);
        myHashset.add(9);
        myHashset.add(9);
        myHashset.add(9);
        System.out.println(myHashset);



    }
}
