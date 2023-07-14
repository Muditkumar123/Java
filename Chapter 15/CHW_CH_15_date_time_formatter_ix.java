import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class CHW_CH_15_date_time_formatter_ix {
    public static void main(String[] args) {
 LocalDateTime dt=LocalDateTime.now();//this is date
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:m a");//this is format
        DateTimeFormatter df1=DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate=dt.format(df);//creating date string using date and format
        System.out.println(myDate);


    }
}
