package Lekcja6.Regex.PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherGrupy {
    public static void main(String[] args) {
        //Matcher pozwala uzyskać dostęp do zgrupowań:
        // group(int x), group(String y) – zwraca grupę o numerze x / nazwie y
        // start(int x), start(String y) – zwraca indeks początku grupy
        // start(int x),start(String y) – zwraca indeks końca grupy
        String people = "Marek; 55; Wozny\n" +
                "Michal Wojt; 112; Pilot\n" +
                "Sebek; 99; Psycholog\n";
        Pattern rowPattern = Pattern.compile(" *(?<Imie>(?:\\w+ ?)+) *; *(?<Wiek>\\d+) *; *+(?<Zawod>(?:\\w+ ?)+) *(?:\\n|\\z)");
        Matcher peopleMatcher = rowPattern.matcher(people);
        while (peopleMatcher.find()) {
            String imie = peopleMatcher.group("Imie");
            String wiek = peopleMatcher.group("Wiek");
            String zawod = peopleMatcher.group("Zawod");
            System.out.println("Imie: " + imie + " Wiek: " + wiek + " Zawod: " + zawod + "");
        }


    }
}
