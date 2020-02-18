package Lekcja8.Grudzien15.Listy;

import java.util.ArrayList;
import java.util.List;

public class PodstawoweMetody {
    public static void main(String[] args) {
        // niemutowalna lista
        List<Integer> integers = List.of(9, 0, 1, 6, 6, 200);
// zwykła, mutowalna lista
        List<String> strings = new ArrayList<>();
        strings.add("Bob");
        strings.add("Snob");
        strings.add("Joe");
        strings.add(1, "Holly");
        strings.remove(3);
//"[Bob, Holly, Snob]"
        System.out.println(strings);
    }
}
