package Lekcja4.Grudzien11.Zadanie1;

import java.util.Scanner;

public class Kolko implements Figura {

    @Override
    public double obliczPowierzchnie() {
        System.out.println("Podaj promien Kola: ");
        double r = new Scanner(System.in).nextDouble();
        double wynik = Math.PI * r * r;
        System.out.println("Powierzchnia kola = " + Math.PI + " * " + r + " * " + r + " = " + wynik);
        return wynik;
    }


}
