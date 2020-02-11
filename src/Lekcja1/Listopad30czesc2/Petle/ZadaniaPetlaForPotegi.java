package Lekcja1.Listopad30czesc2.Petle;

public class ZadaniaPetlaForPotegi {
    //Stwórz tablicę.
    //Korzystając z pętli for wypełnij ją dwudziestoma pierwszymi potęgami liczby 2.
    public static void main(String[] args) {
        int[] tablica = new int[22];
        tablica[0] = 1;
        for (int i = 1; i < tablica.length; i++) {
            tablica[i] = tablica[i - 1] * 2;
            int potega = (i - 1) + 1;
            System.out.println(potega + " potega liczby 2 = " + tablica[i]);
        }
    }
}
