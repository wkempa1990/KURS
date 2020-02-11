package Lekcja1.Listopad30czesc2;

public class Obiekt2 {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Karolina",34);
       // osoba.imie = "Karolina";
        osoba.wiek = 34;
        System.out.println(osoba.imie);
        osoba.urodziny();//metoda w classie osoba ktora dodaje 1 rok do wieku.
        System.out.println(osoba.wiek);
    }
}
