import java.util.Calendar;
import java.util.TimeZone;

public class CHW_CH_15_Clander_vi {
    public static void main(String[] args) {
//        Calendar c =Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        //Calendar c =Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));//setting timezone
        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());



    }
}
