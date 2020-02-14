package Lekcja5.Grudzien14.Wyjatki;

public class WyjatkiSprawdzaneiNieSprawdzane {
    // to się nie skompiluje
    public static void doSomething1() {
        // throw new Exception();
    }

    // to jest w porządku
    public static void doSomething2() {
        throw new RuntimeException();
    }

    // to też jest w porządku
    public static void doSomething3() throws Exception {
        throw new Exception();
    }

}
