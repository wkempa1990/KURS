package InnyKurs.Lekcja1.Zadanie1;

import java.util.Scanner;

//Zadanie 1.1: Program liczący powierzchnię prostokąta (a*b=c)
public class PowierzchniaProstokata {
    public static void main(String[] args) {
        System.out.println("Podaj bok a : ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Podaj bok b :");
        int b = new Scanner(System.in).nextInt();
        int cWynik = a * b;
        System.out.println("Powierznia prostokata wynosi : " + cWynik);
    }
}
