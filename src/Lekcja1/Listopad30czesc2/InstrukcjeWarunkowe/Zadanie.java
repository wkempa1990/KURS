package Lekcja1.Listopad30czesc2.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zadanie {
    //Korzystając z switch-statement napisz funkcję,
    // która będzie zwracała nazwę dnia tygodnia na podstawie numeru (1 => Poniedziałek, etc.)
    public static void main(String[] args) {
        System.out.println("Podaj cyfre od 1 do 7: ");
        int liczba = new Scanner(System.in).nextInt();
        switch (liczba){
            case(1):
                System.out.println("Poniedzialek");
                break;
            case (2):
                System.out.println("Wtorek");
                break;
            case(3):
                System.out.println("Sroda");
                break;
            case (4):
                System.out.println("Czwartek");
                break;
            case (5):
                System.out.println("Piatek");
                break;
            case (6):
                System.out.println("Sobota");
                break;
            case(7):
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Bledna cyfra , trzeba wybrac od 1 do 7");
                break;
        }
    }
}
