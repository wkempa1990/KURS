package Lekcja7.Data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DodawanieiOdejmowanie {
    public static void main(String[] args) {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate someDay = LocalDate.now().plus(Period.of(1, 2, 20));
        LocalTime inAnHour = LocalTime.now().plusHours(1);
        LocalTime someTime = LocalTime.now().minus(Duration.ofHours(2).plusMinutes(10).plusSeconds(5));
        System.out.println(tomorrow);
        System.out.println(someDay);
        System.out.println(inAnHour);
        System.out.println(someTime);
    }
}
