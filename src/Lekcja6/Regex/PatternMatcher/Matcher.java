package Lekcja6.Regex.PatternMatcher;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Matcher {
    public static void main(String[] args) {
        //pattern.matcher(String text) – zwraca instancję klasy Matcher do wyszukiwania dopasowań w podanym tekście
        Pattern emailPattern = Pattern.compile("[\\w.]+@[\\w.]+\\.\\w{2,}");
        String textWithEmails = "kamikaze87@hotmail.com and " + "lkfsadjlkfadsjlk.\n" +
                "wojciech@op.pl ua9hvda9g3" ;
        java.util.regex.Matcher emailMatcher = emailPattern.matcher(textWithEmails);
        List<String> emailList = new ArrayList<>();
        while (((java.util.regex.Matcher) emailMatcher).find()) {
            String email = emailMatcher.group();
            System.out.println("Email podany w tekscie: " + email);
            emailList.add(email);
        }

    }
}
