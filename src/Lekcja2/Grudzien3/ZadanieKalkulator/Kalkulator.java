package Lekcja2.Grudzien3.ZadanieKalkulator;

import java.util.Scanner;

//Zadanie 3. Kalkulator
//Napisz program, który czyta linię tekstu z wejścia standardowego (std.in) w formacie: „liczba operator liczba2”
// a następnie drukuje wynik obliczenia. Program powinien obsługiwać liczby całkowite oraz operatory: +, -, *, /
public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("Podaj dzialanie w formacie liczba(spcja)operator(spacja)liczba  : ");
        String liczba = new Scanner(System.in).nextLine();
        System.out.print(liczba + " = ");
        String[] fragments = liczba.split(" ");
        int num = Integer.parseInt(fragments[0]);
        int num2 = Integer.parseInt(fragments[2]);
        if (fragments[1].equals("+")) {
            System.out.print(num + num2);
        } else if (fragments[1].equals("-")) {
            System.out.print(num - num2);
        } else if (fragments[1].equals("*")) {
            System.out.print(num * num2);
        } else if (fragments[1].equals("/")) {
            if (num == 0 || num2 == 0) {
                System.out.println("Nie dziel przez 0 ...");
            } else {
                System.out.print(num / num2);
            }
        } else {
            System.out.println("Zly znak");
        }
    }
}
