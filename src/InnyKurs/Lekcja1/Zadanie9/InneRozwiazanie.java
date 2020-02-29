package InnyKurs.Lekcja1.Zadanie9;

import java.util.Random;
import java.util.Scanner;

public class InneRozwiazanie {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(100);
            System.out.println("indeks : " + i + " Zawartosc : " + tablica[i]);
        }
        System.out.println("Co chcesz wyszukac?\n1.Wyszukac wartosc w tablicy\n2.Wyszukac wartosc po indeksie");
        int coWyszukac1;
        while (true) {
            coWyszukac1 = new Scanner(System.in).nextInt();
            if (coWyszukac1 == 1 || coWyszukac1 == 2) {
                break;
            } else {
                System.out.println("Wpisz 1 lub 2");
            }
        }
        switch (coWyszukac1) {
            case 1:
                System.out.println("Jakiej wartosci szukasz?");
                int wartosc = new Scanner(System.in).nextInt();

                //przeszukujemy tablicę
                for (int i = 0; i < tablica.length; i++) {
                    if (tablica[i] == wartosc) {
                        System.out.println("Wartosc = " + wartosc + " jest pod indeksem: " + i);
                        break; //jak znajdujemy to przerywamy
                    }
                }
                System.out.println("Szukana wartość nie znajduje się w tabeli");
                break;
            case 2:
                System.out.println("Jakiego indeksu szukasz?");
                int indeks;
                while (true) {
                    indeks = new Scanner(System.in).nextInt();
                    if (indeks < 0 || indeks > tablica.length - 1) {
                        System.out.println("Niepoprawny indeks");
                    } else {
                        break;
                    }
                }
                System.out.println("indeks : " + indeks + ", Wartosc = " + tablica[indeks]);
                break;
        }
    }
}
