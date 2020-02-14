package Lekcja7.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JakPrzeksztalcac {
    public static void main(String[] args) {
        LocalDate someDate = LocalDate.now();
        LocalDateTime toDateTime1 = someDate.atStartOfDay();
        LocalDateTime toDateTime2 = someDate.atTime(20, 0);
        ZonedDateTime toZonedDateTime1 = someDate.atStartOfDay(ZoneId.of("Europe/Warsaw"));
        ZonedDateTime toZonedDateTime2 = someDate.atTime(5, 50).atZone(ZoneId.of("Europe/Warsaw"));
        System.out.println(toDateTime1);
        System.out.println(toDateTime2);
        System.out.println(toZonedDateTime1);
        System.out.println(toZonedDateTime2);

    }
}
