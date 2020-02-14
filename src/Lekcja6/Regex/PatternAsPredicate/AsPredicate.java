package Lekcja6.Regex.PatternAsPredicate;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class AsPredicate {
    public static void main(String[] args) {
        //Predicate<T> - służy do sprawdzania, czy obiekt typu T spełnia określony warunek
        //pattern.asPredicate() – sprawdza czy JAKAKOLWIEK część dopasowuje się do regexa
        Pattern simplePattern = Pattern.compile("0[0-9]{2}");
        Predicate<String> containsPattern = simplePattern.asPredicate();
        boolean test1 = containsPattern.test("000");
        boolean test2 = containsPattern.test("test: 012");
        // true
        System.out.println(test1);
        // true
        System.out.println(test2);
    }
}
