package Lekcja8.Grudzien15.Kolekcja.Iteracja;

import java.util.HashSet;
import java.util.Set;

public class KolekcjaIreracja {
    public static void main(String[] args) {
        Set<String> kraje = new HashSet<>();
        kraje.add("Polska");
        kraje.add("Niemcy");
        kraje.add("Francja");
        kraje.add("Szwecja");
        for (
                String value : kraje) {
            System.out.println(value);
        }
    }
}