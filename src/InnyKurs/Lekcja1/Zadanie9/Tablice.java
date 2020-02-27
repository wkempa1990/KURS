package InnyKurs.Lekcja1.Zadanie9;

import java.util.Random;
import java.util.Scanner;

//Zadanie 2.6:
//Wypełnić tablice 10 elementową losowymi wartościami
//Wypisać zawartość tablicy wraz z indeksami
//Użytkownik może zdecydować się, że chce wyszukać wartość w tablicy, lub odczytać wartość z tablicy znajdującą się pod wybranym indexem.
//Program pyta użytkownika jakiej wartości szuka lub o jaki index pyta
//Użytkownik wpisuje dane
//Program odpowiada użytkownikowi na zadane pytanie
public class Tablice {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tablica = {random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100),
                random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)};
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("indeks : " + i + " Zawartosc : " + tablica[i]);
        }
        System.out.println("Co chcesz wyszukac?\n1.Wyszukac wartosc w tablicy\n2.Wyszukac wartosc po indeksie");
        int coWyszukac = new Scanner(System.in).nextInt();
        if (coWyszukac == 1) {
            System.out.println("Jakiej wartosci szukasz?");
            int wartosc = new Scanner(System.in).nextInt();
            if (wartosc == tablica[0]) {
                System.out.println("indeks : 0, Wartosc = " + tablica[0]);
            } else if (wartosc == tablica[1]) {
                System.out.println("indeks : 1, Wartosc = " + tablica[1]);
            } else if (wartosc == tablica[2]) {
                System.out.println("indeks : 2, Wartosc = " + tablica[2]);
            } else if (wartosc == tablica[3]) {
                System.out.println("indeks : 3, Wartosc = " + tablica[3]);
            } else if (wartosc == tablica[4]) {
                System.out.println("indeks : 4, Wartosc = " + tablica[4]);
            } else if (wartosc == tablica[5]) {
                System.out.println("indeks : 5, Wartosc = " + tablica[5]);
            } else if (wartosc == tablica[6]) {
                System.out.println("indeks : 6, Wartosc = " + tablica[6]);
            } else if (wartosc == tablica[7]) {
                System.out.println("indeks : 7, Wartosc = " + tablica[7]);
            } else if (wartosc == tablica[8]) {
                System.out.println("indeks : 8, Wartosc = " + tablica[8]);
            } else if (wartosc == tablica[9]) {
                System.out.println("indeks : 9, Wartosc = " + tablica[9]);
            } else {
                System.out.println("Podano zla wartosc: " + wartosc);
            }

        } else if (coWyszukac == 2) {
            System.out.println("Jakiego indeksu szukasz");
            int indeks = new Scanner(System.in).nextInt();
            if (indeks == 0) {
                System.out.println("indeks : 0, Wartosc = " + tablica[0]);
            } else if (indeks == 1) {
                System.out.println("indeks : 1, Wartosc = " + tablica[1]);
            } else if (indeks == 2) {
                System.out.println("indeks : 2, Wartosc = " + tablica[2]);
            } else if (indeks == 3) {
                System.out.println("indeks : 3, Wartosc = " + tablica[3]);
            } else if (indeks == 4) {
                System.out.println("indeks : 4, Wartosc = " + tablica[4]);
            } else if (indeks == 5) {
                System.out.println("indeks : 5, Wartosc = " + tablica[5]);
            } else if (indeks == 6) {
                System.out.println("indeks : 6, Wartosc = " + tablica[6]);
            } else if (indeks == 7) {
                System.out.println("indeks : 7, Wartosc = " + tablica[7]);
            } else if (indeks == 8) {
                System.out.println("indeks : 8, Wartosc = " + tablica[8]);
            } else if (indeks == 9) {
                System.out.println("indeks : 9, Wartosc = " + tablica[9]);
            } else {
                System.out.println("Podano bledny indeks : " + indeks);
            }
        } else {
            System.out.println("Prosze podac liczbe 1 lub 2");
        }
    }
}
