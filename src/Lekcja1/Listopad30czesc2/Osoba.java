package Lekcja1.Listopad30czesc2;

public class Osoba {
    //Pola
    String imie;
    int wiek;

    public Osoba(String imie, int wiek) {
        //Konstruktort
        this.imie = imie;
        this.wiek = wiek;
    }

    //metoda
    public void urodziny() {
        wiek = wiek + 1;
    }
}
