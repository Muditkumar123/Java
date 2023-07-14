import java.util.*;

public class CHW_CH_15_Gregorian_vii {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
Calendar c=Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));//24 hour
        System.out.println(c.get(Calendar.MINUTE));

        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.isLeapYear(c.get(Calendar.YEAR)));



     }
}
