package Lekcja3.Grudzien7.KolkoiKrzyzyk;
//Plansza do gry w kółko i krzyżyk składa się z dziewięciu pól.
// Każde pole może być puste, zawierać kółko, albo zawierać krzyżyk.
// Stwórz enuma Pole o wymienionych trzech odmianach.

public enum Pole {
    KRZYZYK('X'), KOLKO('O'), PUSTE(' ');
    private final char znak;

    Pole(char znak) {
        this.znak = znak;
    }

}

