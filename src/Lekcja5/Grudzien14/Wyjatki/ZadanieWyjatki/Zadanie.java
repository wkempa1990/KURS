package Lekcja5.Grudzien14.Wyjatki.ZadanieWyjatki;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        try {
            funkcja();
        } catch (Exception e) {
            System.err.println("Nie podano liczby "); // skrot err drukuje na czerwono
        } catch (OtherException oe) {
            System.err.println("Liczba jest powyzej zakresu [liczba<100] ");
        } catch (SomeException se) {
            System.err.println("Liczba nie jest podzielna przez 5 ");
        }
    }

    //Korzystając z Integer.parseInt(String), napisz funkcję przekształcającą String na int.
    // Stwórz i rzucaj wyjątki jeśli: 1. String nie zawiera liczby
    // 2. Liczba wykracza poza określony przez ciebie zakres
    // 3. Liczba nie jest podzielna przez określoną przez ciebie liczbę
    public static void funkcja() throws OtherException, SomeException {
        System.out.println("Podaj liczbe: ");
        String liczba = new Scanner(System.in).nextLine();
        int liczbaStringa = Integer.parseInt(liczba);
        if (liczbaStringa > 100) {
            throw new OtherException();
        } else if (liczbaStringa % 5 == 0) {
            System.out.println("Podana liczba : " + liczbaStringa);
        } else {
            throw new SomeException();
        }
    }

    public static class OtherException extends Throwable {
    }

    public static class SomeException extends Throwable {
    }

}
