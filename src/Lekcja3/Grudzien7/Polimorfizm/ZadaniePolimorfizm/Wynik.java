package Lekcja3.Grudzien7.Polimorfizm.ZadaniePolimorfizm;

public class Wynik {
    public static void main(String[] args) {
        Pracownik pracownik = getPracownik();
        pracownik.zadanie();
    }


    public static Pracownik getPracownik() {
        return new Menadzer();

    }
}
