package InnyKurs.Lekcja1.Zadanie7;

import java.util.Random;
import java.util.Scanner;

public class ProstaGraZgadnijLiczbe {
    //W programie jest zapisana tajna liczba między 1 a 100.
    // Użytkownik próbuje odgadnąć liczbę, a program za każdym razem podpowiada mu: “więcej”, “mniej”, “brawo! zgadłeś!”
    //Gdy użytkownik zgadnie, program wypisuje ilość prób jaką użytkownik potrzebował i kończy działanie.
    //❖ Zadanie 2.2 zmodyﬁkować program, aby liczba była losowana przy pomocy generatora liczb pseudolosowych:
    //Random generator = new Random();
    //generator.nextInt(int n);
    public static void main(String[] args) {
        Random generator = new Random();
        int a = generator.nextInt(100);
        int licznik = 0;
        do {
            System.out.println("Zgadnij liczbe od 0 do 100 : ");
            int liczba = new Scanner(System.in).nextInt();
            if (liczba < a) {
                System.out.println("Za mala liczba probuj dalej: ");
            } else if (liczba > a) {
                System.out.println("Za duza liczba probuj dalej: ");
            }
            licznik++;
            if (liczba == a) {
                System.out.println("Graulacje!!!!\nZgadles liczbe, liczba prob = " + licznik);
                break;
            }
        } while (licznik < 100);
    }
}
