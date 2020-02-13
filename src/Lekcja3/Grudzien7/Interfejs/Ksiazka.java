package Lekcja3.Grudzien7.Interfejs;

public class Ksiazka implements Filmy {
    public static void main(String[] args) {
        Filmy film = getfajne();
        System.out.println(film.film());
    }

    public static Filmy getfajne() {
        return new Ksiazka();
    }

    @Override
    public String film  () {
        return ("Harry Potter");


    }
}
