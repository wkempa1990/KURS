package InnyKurs.Lekcja1.Zadanie8;

import java.util.Scanner;

//Zadanie 2.3
//Napisać program który wyświetli trójkąt z gwiazdek:
//*
//**
//***
//****
//*****
//Wskazówka: wewnątrz jednej pętli może znajdować się druga pętla
//System.out.print() w odróżnieniu od .println() wyświetla bez \n
//Zadanie 2.4 Zmodyﬁkować program tak, aby wielkość trójkąta podawał użytkownik
public class Choinka {
    public static void main(String[] args) {
        System.out.println("Podaj wielkosc choinki: (max 20)");
        int wielkoscChoinki = new Scanner(System.in).nextInt();
        if (wielkoscChoinki <= 20) {
            for (int i = 0; i < wielkoscChoinki; i++) {
                System.out.println();
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            }
        } else {
            System.out.println("Podaj liczbe od 1 do 20");
        }
    }
}
