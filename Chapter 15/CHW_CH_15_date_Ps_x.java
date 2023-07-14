import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import  java.util.*;

public class CHW_CH_15_date_Ps_x {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//Que-1
//ArrayList <String> names=new ArrayList<String>();
//for (int i=0;i<10;i++){
//    String add=sc.nextLine();
//  names.add(add);
//}
//        System.out.println(names);

  //Ques -4

//        LocalDateTime date2=LocalDateTime.now();
//        DateTimeFormatter form=DateTimeFormatter.ofPattern("H:m:s");
//      String time= date2.format(form);
//        System.out.println(time);

       // ques 2

//      Date d=new Date();
//
//        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

//ques 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));




    }
}
