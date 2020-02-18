package Lekcja8.Grudzien15.Zbiory;

import java.util.HashSet;
import java.util.Set;

public class PodstawoweMetody {
    public static void main(String[] args) {
        // niemutowalny zbiór
        Set<Integer> integerSet = Set.of(1, 2, 3, 4, 5, 6);
// zwykły, mutowalny zbiór
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Twix");
        stringSet.add("Prince Polo");
        stringSet.add("Grzesiek");
        stringSet.add("Grzesiek");
        // "[Prince Polo, Twix, Grzesiek]"
        System.out.println(stringSet);
        stringSet.remove("Twix");
        // "false"
        System.out.println(stringSet.contains("Twix"));
    }
}
