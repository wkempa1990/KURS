package Lekcja4.Grudzien11.Zadanie1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat();
        Kolko kolko = new Kolko();
        Kwadrat kwadrat = new Kwadrat();
        System.out.println("Podaj ilosc figur(od 1 do 3): ");
        int ilosc = new Scanner(System.in).nextInt();
        if (ilosc == 1) {
            System.out.println("Podaj figure:\n1(Kolko)\n2(Prostokat)\n3(Kwadrat)");
            int rodzajFigury = new Scanner(System.in).nextInt();
            if (rodzajFigury == 1) {
                kolko.obliczPowierzchnie();
            } else if (rodzajFigury == 2) {
                prostokat.obliczPowierzchnie();
            } else if (rodzajFigury == 3) {
                kwadrat.obliczPowierzchnie();
            } else {
                System.out.println("Podana zla cyfre");
            }
        } else if (ilosc == 2) {
            System.out.println("Podaj figure:\n1(Kolko)\n2(Prostokat)\n3(Kwadrat)");
            int rodzajFigury = new Scanner(System.in).nextInt();
            System.out.println("Podaj druga figure:\n1(Kolko)\n2(Prostokat)\n3(Kwadrat)");
            int rodzajFigury1 = new Scanner(System.in).nextInt();
            if (rodzajFigury == 1 && rodzajFigury1 == 2 || rodzajFigury == 2 && rodzajFigury1 == 1) {
                kolko.obliczPowierzchnie();
                prostokat.obliczPowierzchnie();
            } else if (rodzajFigury == 1 && rodzajFigury1 == 3 || rodzajFigury == 3 && rodzajFigury1 == 1) {
                kolko.obliczPowierzchnie();
                kwadrat.obliczPowierzchnie();
            } else if (rodzajFigury == 2 && rodzajFigury1 == 3 || rodzajFigury == 3 && rodzajFigury1 == 2) {
                prostokat.obliczPowierzchnie();
                kwadrat.obliczPowierzchnie();
            } else {
                System.out.println("Podana zla cyfre");
            }
        } else if (ilosc == 3) {
            double a = kolko.obliczPowierzchnie();
            double b = prostokat.obliczPowierzchnie();
            double c = kwadrat.obliczPowierzchnie();
            //Najwieksza powierzchnia
            if (a >= b && a >= c) {
                System.out.println("Kolko ma najwieksza powierzchnie : " + a);
            } else if (a >= b && a <= c || a <= b && c >= b) {
                System.out.println("Kwadrat ma najwieksza powierzchnie : " + c);
            } else if (b >= a && b >= c) {
                System.out.println("Prostokat ma najwieksza powierzchnie : " + b);
            }
            //Najmniejsza powierzchnia
            if (a <= b && a <= c) {
                System.out.println("Kolko ma najmniejsza powierzchnie : " + a);
            } else if (a <= b && a >= c || a >= b && b <= c) {
                System.out.println("Kwadrat ma najmniejsza powierzchnie : " + c);
            } else if (b <= a && b <= c) {
                System.out.println("Prostokat ma najmniejsza powierzchnie : " + b);
            }
            //Srednia powierzchnia
            System.out.println("Srednia powierzchnia wszystkich figur: " + (a + b + c) / 3);
        } else {
            System.out.println("Podana zla cyfre");
        }
    }
}



