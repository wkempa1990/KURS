package Lekcja8.Grudzien15.TypyGeneryczne;

public class KlasaGenerycznaZOgraniczeniem {
    public interface Car {
        int getDoorCount();

        double getLength();

        double getHeight();
    }

    public class ExampleBoundedGeneric<T extends Car> {
        public double calculateStuff(T car) {
            // dostęp do metod Car
            return car.getHeight() + car.getLength();
        }
    }
}
