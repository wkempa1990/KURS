package InnyKurs.Lekcja1.Zadanie3;


import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

// Przykład 1.4: Program sprawdzający czy użytkownik jest pełnoletni na podstawie wpisanego wieku
//❖ Zadanie 1.4: Zmodyﬁkować program tak aby pytał o dzień, miesiąc, rok i na tej podstawie sprawdzał wiek użytkownika
public class SprawdzeniePelnoletnosciUzytkownika {
    public static void main(String[] args) {
        System.out.println("Poadaj rok urodzenia: ");
        int rokUrodzenia = new Scanner(System.in).nextInt();
        System.out.println("Podaj miesiac urodzenia [1-12] : ");
        int miesiacUrodzenia = new Scanner(System.in).nextInt();
        System.out.println("Podaj dzien urodzenia : ");
        int dzienUrodzenia = new Scanner(System.in).nextInt();
        LocalDate data = LocalDate.now();
        int rokAktualny = data.getYear();
        //miesiac aktualny podany w formacie liczb
        int miesiacAktualny = data.getMonthValue();
        int dzienAkualny = data.getDayOfMonth();
        if (rokAktualny - rokUrodzenia > 18) {
            System.out.println("Jestes Pelnoletni :)");
        } else if (rokAktualny - rokUrodzenia == 18 && miesiacAktualny > miesiacUrodzenia) {
            System.out.println("Jestes Pelnoletni :) ");
        } else if (rokAktualny - rokUrodzenia == 18 && miesiacAktualny == miesiacUrodzenia && dzienAkualny >= dzienUrodzenia) {
            System.out.println("Jestes Pelnoletni :) ");
        } else {
            System.out.println("Jestes Niepelnoletni :(");
        }
    }
}
