package Lekcja7.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatowaniePrasowanie {
    public static void main(String[] args) {
        String dateTimeString = "2016-06-09T12:00:00";
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime someDateTime = LocalDateTime.parse(dateTimeString, dtf);
        System.out.println(someDateTime);
        String dateTimeString2 = dtf.format(someDateTime.plusWeeks(5));
        System.out.println(dateTimeString2);
        String dateString = "1998/02/04";
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        LocalDate someDate = LocalDate.parse(dateString, dtf2);
        System.out.println(someDate);
        String dateString2 = dtf2.format(someDate.minusYears(20));
        System.out.println(dateString2);

    }
}
