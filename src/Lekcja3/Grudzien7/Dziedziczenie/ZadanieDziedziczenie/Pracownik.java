package Lekcja3.Grudzien7.Dziedziczenie.ZadanieDziedziczenie;

//Stwórz dwie klasy – niech jedna z nich będzie podtypem drugiej.
// Napisz w nadrzędnej jakąś metodę.
//Następnie napisz program, w którym spróbujesz na obiekcie podtypu wykorzystać metodę napisaną w klasie nadrzędnej.
//Nie masz pomysłu na klasę? Może to być:
// Pracownik oraz konkretny rodzaj pracownika, np. Menedżer, Deweloper
public class Pracownik {
    public void zadanie() {
        int a = 10;
        int b = 5;
        System.out.println("Wynik dzialania : " + a + " + " + b + " = " + (a + b));
    }
}
