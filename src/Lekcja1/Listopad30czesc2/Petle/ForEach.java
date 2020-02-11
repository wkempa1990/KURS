package Lekcja1.Listopad30czesc2.Petle;

public class ForEach {
    public static void main(String[] args) {
        String[] names = new String[]{"Harry", "Ron", "Hermione", "Ginny", "Fred", "George"};
        int[] liczba = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        for (String name : names) {
            System.out.println("Imię: " + name);
        }
        for (int liczby : liczba) {
            System.out.println("liczba: " + liczby);
        }
    }
}
