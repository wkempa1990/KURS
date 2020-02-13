package Lekcja4.Grudzien11.Zadanie1;

import java.util.Scanner;

public class Kwadrat implements Figura {
    @Override
    public double obliczPowierzchnie() {
        System.out.println("Podaj dlugosc boku kwadratu: ");
        double a = new Scanner(System.in).nextDouble();
        double wynik = a * a;
        System.out.println("Powierznia kwadratu: " + a + " * " + a + " = " + wynik);
        return (wynik);
    }
}
