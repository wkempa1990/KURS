package Lekcja4.Grudzien11.Zadanie1;

import java.util.Scanner;

public class Prostokat implements Figura {

    @Override
    public double obliczPowierzchnie() {
        System.out.println("Podaj dlugosc pierwszego boku prostokata: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Podaj dlugosc drugiego boku prostokata: ");
        double b = new Scanner(System.in).nextDouble();
        double wynik = a * b;
        System.out.println("Powierzchnia prostokata = " + a + " * " + b + " = " + wynik);
        return (wynik);
    }
}
