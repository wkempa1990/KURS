package Lekcja8.Grudzien15.TypyGeneryczne;

import java.util.List;

public class MetodaGeneryczna {
    public static <T> T getFirst(List<T> list) {
        return list.get(0);
    }
}
