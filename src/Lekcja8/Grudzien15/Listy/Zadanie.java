package Lekcja8.Grudzien15.Listy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Korzystając z ArrayListy oraz pętli stwórz listę zawierającą
// 20 pierwszych wartości ciągu Fibonacciego (n0 = 0, n1 = 1, nx = nx-1 + nx-2)
public class Zadanie {
    public static void main(String[] args) {
        List<Integer> ciagFibonacciego = new ArrayList<>(20);
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i <= 20; i++) {
            c = a;
            a = b;
            b = b + c;
            ciagFibonacciego.add(c);
            System.out.println(ciagFibonacciego);
        }
    }
}