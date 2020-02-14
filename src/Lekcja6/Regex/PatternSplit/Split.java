package Lekcja6.Regex.PatternSplit;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Split {
    public static void main(String[] args) {
        //pattern.split(String text) – dzieli podany tekst na fragmenty oddzielane przez dopasowania do regexa
        Pattern separator = Pattern.compile("[-_ ]+");
        String text = "Tata-Wojtek_byl---wczoraj____caly       dzien w domu";
        String[] words = separator.split(text);
        //Podaje tekst po przecinkach
        System.out.println(Arrays.toString(words));
        //Podaje tekst po jednej spacji " "
        System.out.println(String.join(" ", words));

    }
}
