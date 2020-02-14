package Lekcja7.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

//Oblicz: 1. ile dni zostało do następnych urodzin
// 2. ile tygodni minęło od Prima Aprilis
// 3. ile milisekund pozostało do końca tych zajęć
public class Zadanie1 {
    public static void main(String[] args) {
        LocalDate urodziny = LocalDate.of(2020, 11, 25);
        long days = LocalDate.now().until(urodziny, ChronoUnit.DAYS);
        System.out.println("Pozostalo : "+days+" dni do nastepnych urodzin");
        LocalDate primaAprilis = LocalDate.of(2020, 04, 01);
        long tydzien = LocalDate.now().until(primaAprilis, ChronoUnit.WEEKS);
        System.out.println("Pozostalo : "+tydzien+" tygodni do nastepnych Prima Aprilis");
        LocalTime koniecZajec = LocalTime.of(23, 30, 00);
        long koniec = LocalTime.now().until(koniecZajec, ChronoUnit.MILLIS);
        System.out.println("Pozostalo : "+koniec+" milisekund do konca zajec");
    }
}
