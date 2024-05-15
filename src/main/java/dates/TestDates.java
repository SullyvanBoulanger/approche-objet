package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat formattor = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formattor.format(date));
        
        SimpleDateFormat hourFormattor = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(hourFormattor.format(date));
    }
}
