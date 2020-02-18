package Lekcja8.Grudzien15.Listy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sortowanie {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(90);
        numbers.add(80);
        numbers.add(70);
        numbers.add(60);
        numbers.add(50);
        numbers.add(40);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);
        // "[100, 90, 80, 70, 60, 50, 40, 30, 20, 10]"
        System.out.println(numbers);
        numbers.sort(null);
        // "[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]"
        System.out.println(numbers);
        Comparator<Integer> reverseOrder = Comparator.reverseOrder();
        numbers.sort(reverseOrder);
        // "[100, 90, 80, 70, 60, 50, 40, 30, 20, 10]"
        System.out.println(numbers);
    }
}
