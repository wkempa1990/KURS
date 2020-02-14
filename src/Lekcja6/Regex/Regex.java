package Lekcja6.Regex;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        //Aby sprawdzić dopasowanie fragmentu:
        boolean kodPocztowy = Pattern.matches("\\d{2}-\\d{3}}", "81-589");
        // sprawdzenie czy kod input: 81-589 jest taki sam jak \\d{2}-\\d{3}
        System.out.println("Czy kod 81-589 jest kodem pocztowym: " + kodPocztowy);
        //Bardziej złożone czynności:
        Pattern simplePattern = Pattern.compile("0[0-9]{2}");

    }
}
