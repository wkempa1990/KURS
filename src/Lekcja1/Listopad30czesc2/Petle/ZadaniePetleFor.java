package Lekcja1.Listopad30czesc2.Petle;

public class ZadaniePetleFor {
    //Stwórz tablicę (np. liczb: 1, 2, 3, 4, 5, 6, 7, 8)
    //Korzystając z pętli for przeiteruj po tej tablicy od początku do końca, a następnie od końca do początku.
    public static void main(String[] args) {
        int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = tablica.length - i;
            System.out.print(tablica[i] + " ");
        }
    }
}
