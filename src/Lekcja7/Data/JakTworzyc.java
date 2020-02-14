package Lekcja7.Data;

import java.net.SocketOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class JakTworzyc {
    public static void main(String[] args) {
        LocalDate dateExample1 = LocalDate.of(2015, 10, 15);
        LocalTime timeExample1 = LocalTime.of(16, 48, 55);
        LocalDateTime dateTimeExample1 = LocalDateTime.of(dateExample1, timeExample1);
        ZonedDateTime zonedDateTimeExample1 = ZonedDateTime.now();
        System.out.println(dateExample1);
        System.out.println(timeExample1);
        System.out.println(dateTimeExample1);
        System.out.println(zonedDateTimeExample1);

    }
}
