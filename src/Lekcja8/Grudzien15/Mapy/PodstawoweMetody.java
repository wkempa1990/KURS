package Lekcja8.Grudzien15.Mapy;

import java.util.HashMap;
import java.util.Map;

public class PodstawoweMetody {
    public static void main(String[] args) {
        // niemutowalna mapa
        Map<String, Integer> personAges = Map.of("Ania", 25, "Karolina", 60);
        Map<String, Integer> points = new HashMap<>();
        points.put("Gryffindor", 100);
        points.put("Slytherin", 5);
        points.put("Ravenclaw", 250);
        points.put("Hufflepuff", 30);
        points.replace("Ravenclaw", 130);
        // "Ravenclaw: 130"
        System.out.println("Ravenclaw: " + points.get("Ravenclaw"));
        points.remove("Slytherin");
        // false
        System.out.println(points.containsKey("Slytherin"));
    }
}
