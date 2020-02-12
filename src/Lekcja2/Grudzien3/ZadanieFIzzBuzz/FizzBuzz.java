package Lekcja2.Grudzien3.ZadanieFIzzBuzz;

//Zadanie 1. FizzBuzz
//Napisz program, który będzie iterował od 1 do 100.
// ❖ Przy liczbach podzielnych przez 3 (ale nie przez 5) ma drukować Fizz
// ❖ Przy liczbach podzielnych przez 5 (ale nie przez 3) ma drukować Buzz
// ❖ Przy liczbach podzielnych przez 3 oraz 5 ma drukować FizzBuzz
// ❖ W pozostałych przypadkach ma drukować samą liczbę
//Przykład dla zakresu 10..15: Buzz 11 Fizz 14 FizzBuzz
//Podpowiedź: liczby podzielne przez 3 oraz 5 są podzielne także przez 15
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }
}
