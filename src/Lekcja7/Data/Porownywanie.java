package Lekcja7.Data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Porownywanie {
    public static void main(String[] args) {
        LocalDate christmas = LocalDate.of(2019, 12, 25);
        long days = LocalDate.now().until(christmas, ChronoUnit.DAYS);
        System.out.printf("Days until Christmas: %d%n", days);

    }
}
