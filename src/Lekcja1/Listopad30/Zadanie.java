package Lekcja1.Listopad30;


//Napisz program obliczający i drukujący ile miesięcy minęło od twojego urodzenia.
public class Zadanie {
    public static void main(String[] args) {
        // (rokBiezacy - rokUrodzenia)*12+ (miesiacBiezacy - miesiacUrodzenia)
        int rokBiezacy = 2020;
        int rokUrodzenia = 1990;
        int miesiacBiezacy = 02;
        int miesiacUrodzenia = 11;
        int mineloMiesiecy = (rokBiezacy - rokUrodzenia) * 12 + (miesiacBiezacy - miesiacUrodzenia);
        System.out.println("Zadanie 1: " + "Od mojego urodzenia minelo: " + mineloMiesiecy + " miesiecy");
        int wynik = rokBiezacy2(2020, 02) - rokUrodzenia2(1990, 11);
        System.out.println("Zadanie 2: " + "Od mojego urodzenia minelo: " + wynik + " miesiecy");
        //Korzystając z klasy napisanej w zadaniu 4 napisz metodę, która będzie wypisywała „Minęło przynajmniej sto miesięcy!”
        // jeśli minęło przynajmniej sto miesięcy od podanego miesiąca i roku
        if (wynik >100) {
            System.out.println("Minelo przynajmniej 100 miesiecy: " + wynik);
        } else {
            System.out.println("Nie minelo 100 miesiecy: " + wynik);
        }
    }

    //Aby poprawić program z zadania 2, przekształć go aby wykorzystywał funkcję przyjmującą jako argumenty rok i miesiąc obecny
    // oraz rok i miesiąc urodzenia, a zwracającą wartość typu int.
    public static int rokBiezacy2(int rokB, int miesiacB) {
        return (rokB * 12) + miesiacB;
    }

    public static int rokUrodzenia2(int rokU, int miesiacU) {
        return (rokU * 12) + miesiacU;
    }


}
