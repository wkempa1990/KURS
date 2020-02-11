package Lekcja1.Listopad30czesc2.Tablice;

public class Tablice {
    public static void main(String[] args) {
        int[] i = new int[5];
        double[] d = new double[]{1.0, 1.1, 1.2, 1.3, 1.4};
        String[] s = {"Alfa", "Beta", "Gamma"};
        String[] marki = {"Honda", "Fiat", "Ford", "Toyota", "BMW"};
        int len = marki.length;
        System.out.println(len);
        String honda = marki[0];
        System.out.println(honda);
        marki[1] = "Audi";
        System.out.println(marki[1]);

    }
}
