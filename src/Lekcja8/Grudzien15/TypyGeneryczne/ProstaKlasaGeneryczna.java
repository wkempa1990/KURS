package Lekcja8.Grudzien15.TypyGeneryczne;

public class ProstaKlasaGeneryczna<T> {
    private T content;

    public ProstaKlasaGeneryczna(T value) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

