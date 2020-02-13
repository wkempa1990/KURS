package Lekcja3.Grudzien7.Polimorfizm.ZadaniePolimorfizm;

public class Menadzer extends Pracownik {
    @Override
    public void zadanie() {
        int a = 1000;
        int b = 500;
        System.out.println("Menadzer == Wynik dzialania : " + a + " + " + b + " = " + (a + b));
    }
}
