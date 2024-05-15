package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 4, 19, 23, 59, 30);
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, 4);
        calendar.set(Calendar.DAY_OF_MONTH, 19);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 30);

        SimpleDateFormat formattor = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formattor.format(calendar.getTime()));

        Date date = Calendar.getInstance().getTime();
        
        SimpleDateFormat hourFormattor = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss");
        System.out.println(hourFormattor.format(date));

        SimpleDateFormat japaneseFormattor = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.JAPANESE);
        System.out.println(japaneseFormattor.format(date));

        SimpleDateFormat deutch = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);
        System.out.println(deutch.format(date));

        SimpleDateFormat russianFormattor = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
        System.out.println(russianFormattor.format(date));

        SimpleDateFormat chineseFormattor = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.SIMPLIFIED_CHINESE);
        System.out.println(chineseFormattor.format(date));
    }
}
