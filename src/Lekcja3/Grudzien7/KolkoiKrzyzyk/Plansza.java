package Lekcja3.Grudzien7.KolkoiKrzyzyk;

//Planszę do gry w kółko i krzyżyk można przedstawić jako wielowymiarową tablicę o wymiarach 3 na 3, składającą się z Pól (z poprzedniego zadania)
//a) Stwórz planszę zawierającą same puste pola
//b) Stwórz planszę zawierającą trzy krzyżyki w którymś rzędzie
public class Plansza {
    public static void main(String[] args) {
        Plansza drukuj = new Plansza();
        drukuj.stworzplansze();
    }


    //a)
    Pole[][] pustePola = {{Pole.PUSTE, Pole.PUSTE, Pole.PUSTE},
            {Pole.PUSTE, Pole.PUSTE, Pole.PUSTE},
            {Pole.PUSTE, Pole.PUSTE, Pole.PUSTE}};
    //b
    Pole[][] rzad = {{Pole.KRZYZYK, Pole.KRZYZYK, Pole.KRZYZYK},
            {Pole.PUSTE, Pole.PUSTE, Pole.PUSTE},
            {Pole.PUSTE, Pole.PUSTE, Pole.PUSTE}};

    //Jeśli plansza nie zawiera już ani jednego pustego pola, to gra w kółko i krzyżyk się kończy.
    // Napisz metodę, która będzie sprawdzać, czy plansza nie zawiera ani jednego pustego pola.
    // Jeśli plansza zawiera chociaż jedno puste pole,
    // metoda zwróci false W przeciwnym przypadku metoda ma zwrócić true
    public boolean czyPlanszaPelna() {
        for (int i = 0; i < pustePola.length; i++) {
            Pole[] rzad = pustePola[i];
            for (int j = 0; j < rzad.length; j++) {
                if (pustePola.equals(Pole.PUSTE)) {
                    return false;
                }
            }
        }
        return true;
    }

    //Napisz metodę, która sprawdza, czy podana plansza zawiera trzy te same znaki w którymś rzędzie.
    public boolean trzyWRzedzie(Pole znak) {
        for (int i = 0; i < pustePola.length; i++) {
            Pole[] rzad = pustePola[i];
            for (int j = 0; j < rzad.length; j++) {
                if (pustePola[0].equals(znak) && pustePola[1].equals(znak) && pustePola[2].equals(znak)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Napisz metodę, która sprawdza, czy plansza zawiera trzy te same znaki w którejś kolumnie.
    public boolean trzyWPionie(Pole znak) {
        for (int i = 0; i < pustePola.length; i++) {
            Pole[] rzad = pustePola[i];
            for (int j = 0; j < rzad.length; j++) {
                if (pustePola[0][0].equals(znak) && pustePola[1][0].equals(znak) && pustePola[2][0].equals(znak) ||
                        pustePola[0][1].equals(znak) && pustePola[1][1].equals(znak) && pustePola[2][1].equals(znak) ||
                        pustePola[0][2].equals(znak) && pustePola[1][2].equals(znak) && pustePola[2][2].equals(znak)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Napisz metodę, która sprawdza, czy plansza zawiera trzy te same znaki w którejś z dwóch przekątnych.
    public boolean trzyPoSkosie(Pole znak) {
        for (int i = 0; i < pustePola.length; i++) {
            Pole[] rzad = pustePola[i];
            for (int j = 0; j < rzad.length; j++) {
                if (pustePola[0][0].equals(znak) && pustePola[1][1].equals(znak) && pustePola[2][2].equals(znak) ||
                        pustePola[0][2].equals(znak) && pustePola[1][1].equals(znak) && pustePola[2][0].equals(znak)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Wyświetlając naszą planszę w terminal chcielibyśmy zobaczyć pojedyńczy znak zamiast długiego tekstu takiego jak PUSTE czy KÓŁKO.
    // Napisz funkcję, która przyjmuje Pole, a zwraca:
    //dla PUSTE => spację
    // dla KÓŁKO => “O”
    // dla KRZYŻYK => “X”
    public Pole[][] stworzplansze() {
        Pole[][] getpustaPlansza = {
                {Pole.KRZYZYK, Pole.PUSTE, Pole.PUSTE},
                {Pole.PUSTE, Pole.KOLKO, Pole.PUSTE},
                {Pole.PUSTE, Pole.PUSTE, Pole.PUSTE}
        };
        return getpustaPlansza;
    }

}