package Lekcja5.Grudzien14.Wyjatki.TryFianly;

public class LapanieWyjatkow {
    public static void main(String[] args) {
        System.out.println("A");
        doSomething();
        System.out.println("D");
    }

    public static void doSomething() {
        try {
            System.out.println("B");
            throw new RuntimeException();
        } finally {
            System.out.println("C");
        }
    }

}
