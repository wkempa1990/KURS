package InnyKurs.Lekcja1.Zadanie4;

import java.util.Scanner;

//Prosty teleturniej. Program ma zadać użytkownikowi 3 pytania. Użytkownik może odpowiedzieć 1, 2 lub 3.
// I za każdą odpowiedź poprawną zdobywa 10 punktów. Na koniec program wyświetla ilość zdobytych punktów.
public class ProstyTeleturniej {
    public static void main(String[] args) {

        System.out.println("Witamy w grze:\nPytanie pierwsze:(odp 1,2 lub 3) Pilka nozna(10pkt): W sezonie 2018/19 Lige Mistrzow wygral zespol:" +
                "\n1.Real Madryt" +
                "\n2.Liverpool" +
                "\n3.Tottenham");
        int odpowiedz1 = new Scanner(System.in).nextInt();
        switch (odpowiedz1) {
            case (1):
                System.out.println("Zla odpowiedz, Poprawna odpowiedz to Liverpool");
                break;
            case (2):
                int a = 10;
                System.out.println("Poprawna odpowiedz zdobywasz 10pkt");
                break;
            case (3):
                System.out.println("Zla odpowiedz, Poprawna odpowiedz to Liverpool");
                break;
            default:
                System.out.println("Niepoprawna odpowiedz wybierz od 1 do 3");


        }
        System.out.println("Pytanie drugie:(odp 1,2 lub 3) Pilka nozna(10pkt): W sezonie 2018/19 Mistrzem Polski zostal zespol:" +
                "\n1.Legia Warszawa" +
                "\n2.Piast Gliwice" +
                "\n3.Lech Poznan");
        int odpowiedz2 = new Scanner(System.in).nextInt();
        switch (odpowiedz2) {
            case (1):

                System.out.println("Zla odpowiedz, Poprawna odpowiedz to Piast Gliwice");
                break;
            case (2):
                int b = 10;
                System.out.println("Poprawna odpowiedz zdobywasz 10pkt");
                break;
            case (3):
                System.out.println("Zla odpowiedz, Poprawna odpowiedz to Piast Gliwice");
                break;
            default:
                System.out.println("Niepoprawna odpowiedz wybierz od 1 do 3");
        }


        if (odpowiedz1 == 2 && odpowiedz2 == 2) {
            System.out.println("Pytanie Bonusowe: Matematyka(10pkt): 2+2*2= ");
            int odpowiedz3 = new Scanner(System.in).nextInt();
            if (odpowiedz3 == 6) {
                System.out.println("Poprawna odpowiedz zdobywasz 10pkt");
                System.out.println("Koncowy wynik 3/3 30pkt");
            } else {
                System.out.println("Zla odpowiedz, Poprawna odpowiedz to 6");
                System.out.println("Koncowy wynik 2/3 20pkt");
            }
        } else if (odpowiedz1 != 2 && odpowiedz2 == 2 || odpowiedz1 == 2 && odpowiedz2 != 2) {
            System.out.println("Pytanie Bonusowe: Matematyka(10pkt): 2+2*2= ");
            int odpowiedz3 = new Scanner(System.in).nextInt();
            if (odpowiedz3 == 6) {
                System.out.println("Poprawna odpowiedz zdobywasz 10pkt");
                System.out.println("Koncowy wynik 2/3 20pkt");
            } else {
                System.out.println("Zla odpowiedz, Poprawna odpowiedz to 6");
                System.out.println("Koncowy wynik 1/3 10pkt");
            }
        } else {
            System.out.println("Pytanie Bonusowe: Matematyka(10pkt): 2+2*2= ");
            int odpowiedz3 = new Scanner(System.in).nextInt();
            if (odpowiedz3 == 6) {
                System.out.println("Poprawna odpowiedz zdobywasz 10pkt");
                System.out.println("Koncowy wynik 1/3 10pkt");
            } else {
                System.out.println("Zla odpowiedz, Poprawna odpowiedz to 6");
                System.out.println("Koncowy wynik 0/3 0pkt");
            }
        }

    }
}
