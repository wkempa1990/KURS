package Lekcja5.Grudzien14.Wyjatki.TryCatch;

public class LapanieWyjatkow {
    public static void main(String[] args) {
        System.out.println("Wyciągamy tekst!");
        try {
            String someString = getString();
            System.out.println("Wyciągnięty tekst:");
            System.out.println(someString);
        } catch (Exception e) {
            System.out.println("Wystąpił wyjątek");
        }
    }

    public static String getString() throws Exception {
        throw new Exception("Ups");
    }

}
