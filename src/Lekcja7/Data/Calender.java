package Lekcja7.Data;

import java.util.Calendar;
import java.util.Date;

public class Calender {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.JANUARY, 16, 20, 0);
        int month = calendar.get(Calendar.MONTH);
        // "0" - miesiące liczone od zera
        System.out.println(month);
        Date date = Date.from(calendar.toInstant());
        date.toInstant();
        calendar.setTime(date);
    }
}
