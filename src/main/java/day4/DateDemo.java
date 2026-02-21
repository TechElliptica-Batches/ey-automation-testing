package day4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // 1900 , 1989
        // 1989 - 1900 = 89
        // 2026 - 1900 = 126
        Date d1 = new Date();
        // customized
        d1.setDate(1);
        d1.setMonth(1);
        d1.setYear(126);
        d1.setHours(12);
        d1.setMinutes(34);
        d1.setSeconds(12);

        System.out.println(d1);

        // 04-JUL-2026

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm aaa");
        String formattedDate = sdf.format(d1);
        System.out.println(formattedDate);


    }
}
