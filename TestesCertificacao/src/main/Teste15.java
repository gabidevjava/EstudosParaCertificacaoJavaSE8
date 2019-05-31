package main;

import java.util.function.Predicate;

public class Teste15 {
    public static void main(String[] args) {
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        Predicate<String> p = s -> s.toUpperCase().substring(0,1).equals("A");

        processStringArray(arr, p);
    }

    private static void processStringArray(String [] arr, 
                                               Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}