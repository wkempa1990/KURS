package Lekcja1.Listopad30czesc2.InstrukcjeWarunkowe;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        String name = "Wojtek";
        switch (name) {
            case "Tomek":
                System.out.println("Ładne imię, Tomek!");
                break;
            case "Marta":
                System.out.println("Dawno się nie widzieliśmy, Marta!");
                break;
            case "Adam":
                System.out.println("Wisisz mi pieniądze, Adam!");
                break;
            default:
                System.out.println("Kim jesteś? Nie kojarzę ciebie...");
        }
    }
}