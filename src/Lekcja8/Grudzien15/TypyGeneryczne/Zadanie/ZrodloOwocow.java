package Lekcja8.Grudzien15.TypyGeneryczne.Zadanie;

public class ZrodloOwocow<F> {
    public F owoc;

    public ZrodloOwocow(F owoc) {
        this.owoc = owoc;
    }

    public F getowoc() {
        return owoc;
    }
}