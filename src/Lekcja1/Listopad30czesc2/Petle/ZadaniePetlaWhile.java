package Lekcja1.Listopad30czesc2.Petle;

public class ZadaniePetlaWhile {
    //Pewne małe miasteczko ma 1000 mieszkańców. Korzystając z pętli while oblicz,
    // za ile miasteczko lat osiągnie populację 2000 mieszkańców zakładając,
    // że co roku populacja przyrasta o 2%, a dodatkowo co roku zamieszkuje w nim 70 ludzi z innych miast
    public static void main(String[] args) {
        int m = 1000; //aktualna liczba miasteczka
        int rok = 0;
        while (m < 2000 || rok < 0) {
            m =(int)( m + (m * 0.02) + 70);
            rok = rok + 1;
            System.out.println("Miasteczko po " + rok + " roku liczy mieszkancow: " + m);
        }
    }
}
