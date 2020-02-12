package Lekcja2.Grudzien3.ZadanieCiagFibonacciego;

import java.util.Scanner;

//Zadanie 2. Ciąg Fibonacciego
//Napisz program, który będzie drukował N pierwszych elementów ciągu Fibonacciego.
// Ciąg Fibonacciego jest definiowany następująco: zerowa wartość jest równa 0,
// pierwsza jest równa 1, a każda kolejna – sumie dwóch poprzednich. Czyli: 0, 1, 1, 2, 3, 5, 8, 13…
//Podpowiedź: Oczywiście przyda się do tego pętla. Zawsze musisz przechowywać dwie ostatnie wartości.
//
public class CiagFibonacciego {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe od 0 do 47 : ");
        int liczba = new Scanner(System.in).nextInt();
        int a = 0;
        int b = 1;
        int c;
        if (liczba < 47) {
            for (int i = 0; i <= liczba; i++) {
                c = a;
                a = b;
                b = b + c;
                System.out.println(c);
            }
        } else {
            System.out.println("Podana liczba jest za duza: " + liczba);
        }
    }
}
