package InnyKurs.Lekcja1.Zadanie5;

import java.util.Scanner;

//Zadanie 1.6: Zmodyﬁkować program liczący powierzchnie i objętości,
// tak aby użytkownik mógł wybrać co chce policzyć i na tej podstawie powinna zostać wywołana odpowiednia funkcja licząca
public class StozekWybor {
    public static void main(String[] args) {
        System.out.println("Wybierz co obliczyc\n1.Objetosc Stozka\n2.Pole boczne");
        int wybor = new Scanner(System.in).nextInt();
        switch (wybor) {
            case (1):
                System.out.println("Podaj promien : ");
                double r = new Scanner(System.in).nextDouble();
                System.out.println("Podaj wysokosc : ");
                double h = new Scanner(System.in).nextDouble();
                objeoscStozka(r, h);
                System.out.println("Objetosc stozka = " + objeoscStozka(r, h));
                break;
            case (2):
                System.out.println("Podaj promien : ");
                double a = new Scanner(System.in).nextDouble();
                poleBoczne(a);
                System.out.println("Pole boczne = " + poleBoczne(a));
                break;
            default:
                System.out.println("Podana zla komende");
        }
    }

    //Objetosc stozka
    public static double objeoscStozka(double r, double h) {
        double pB = Math.PI * Math.pow(r, 2);
        double a = 0.3333333333;
        return a * pB * h;
    }

    //Pole boczne
    public static double poleBoczne(double r) {
        return Math.PI * Math.pow(r, 2);
    }
}

