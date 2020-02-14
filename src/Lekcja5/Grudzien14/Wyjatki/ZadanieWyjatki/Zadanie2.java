package Lekcja5.Grudzien14.Wyjatki.ZadanieWyjatki;

import java.util.Scanner;

//Stwórz i wypełnij tablicę Stringów. Korzystając z klasy Scanner napisz funkcję,
// która przyjmuje od użytkownika indeks i drukuje element tablicy określony  tym indeksem.
// Jeśli taki indeks nie istnieje lub użytkownik nie wprowadził liczby – złap wyjątek i powtórz
public class Zadanie2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5)
            try {
                funkcja();
                i = 6;
            } catch (Exception e) {
                System.err.println("Nie podano liczby "); // skrot err drukuje na czerwono

            } catch (Zadanie2.OtherException oe) {
                System.err.println("Podano zbyt duza liczbe : ");
            }
    }

    public static void funkcja() throws OtherException {
        System.out.println("Podaj Index tablicy od 0 do 5 : ");
        String[] tablica = {"Wojtek", "Marek", "Kuba", "Michal", "Arek", "Karol"};
        int index = new Scanner(System.in).nextInt();
        if (index == 0) {
            System.out.println(tablica[0]);
        } else if (index == 1) {
            System.out.println(tablica[1]);
        } else if (index == 2) {
            System.out.println(tablica[2]);
        } else if (index == 3) {
            System.out.println(tablica[3]);
        } else if (index == 4) {
            System.out.println(tablica[4]);
        } else if (index == 5) {
            System.out.println(tablica[5]);
        } else {
            throw new Zadanie2.OtherException();

        }
    }

    public static class OtherException extends Throwable {
    }

}
