package day4;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)); // index
        System.out.println(cal.get(Calendar.DATE));

        cal.add(Calendar.MONTH, -2);
        System.out.println(cal.getTime());

        // 25-Nov-2026

//        int date = cal.get(Calendar.DATE);
//        String StartDate = String.valueOf(date);
//        int month = cal.get(Calendar.MONTH); // 0
//        System.out.println(StartDate);
        //String text = "25-01-2026";





    }
}
