package InnyKurs.Lekcja1.Zadanie6;

import java.util.Scanner;

//Napisać program, który pyta użytkownika o liczbę, a następnie wypisuje
// oddzielone przecinkiem wszystkie liczby od 0 do wpisanej liczby.
public class PetlaWhile {
    public static void main(String[] args) {
        int licznik = 0;
        System.out.println("Podaj liczbe: ");
        int liczba = new Scanner(System.in).nextInt();
        while (licznik<=liczba){
            System.out.print(licznik +" , ");
            licznik++;

        }
    }
}
