package Lekcja3.Grudzien7.Polimorfizm;

public class PolimorfizmUzycie {
    public static void main(String[] args) {
        Ptak ptak = getPtak();
        Ptak ptak2 = getPtak2();
        ptak.spiew();
        ptak2.spiew();
    }

    public static Ptak getPtak() {
        return new Wrona();
    }

    public static Ptak getPtak2() {
        return new Bocian();
    }

}
