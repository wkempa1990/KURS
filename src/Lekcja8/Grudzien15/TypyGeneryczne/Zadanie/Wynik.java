package Lekcja8.Grudzien15.TypyGeneryczne.Zadanie;

public class Wynik<F, T> {
    public static void main(String[] args) {

    }


    private ZrodloOwocow<F> owoc;
    private ZakladDoPrzetwarzaniaOwocow<F, T> napoj;
    private SkupNapojow<T> skup;
    private double kasa = 0.0;

    public Wynik(ZrodloOwocow<F> owoc, ZakladDoPrzetwarzaniaOwocow<F, T> napoj, SkupNapojow<T> skup) {
        this.owoc = owoc;
        this.napoj = napoj;
        this.kasa = sprawdzKase();

    }

    public double sprawdzKase() {
        return kasa;
    }
}
