package InnyKurs.Lekcja1.Zadanie2;

import java.util.Scanner;

//Zadanie 1.2: Program liczący objętość stożka
//V=1/3*Pb*H
//Pb=pi*r^2
public class ObjetoscStozka {
    public static void main(String[] args) {
        System.out.println("Podaj promien : ");
        double r = new Scanner(System.in).nextDouble();
        System.out.println("Podaj wysokosc : ");
        double h = new Scanner(System.in).nextDouble();
        //Pole boczne
        double pB = Math.PI * Math.pow(r, 2);
        System.out.println("Pole boczne = " + pB);
        //1/3 zwraca nam wartosc = 0
        // 1/3 na kalkulatorze to 0,3333333333
        double a = 0.3333333333;
        System.out.println("Wynik dzilania 1/3 = " + a);
        //wzor na objetosc = 1/3*Pb*H
        double objetoscStozka = a * pB * h;
        System.out.println("Objetosc stozka = " + objetoscStozka);
    }
}

