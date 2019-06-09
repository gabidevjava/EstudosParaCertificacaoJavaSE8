package main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Agora {
	
	public static void main(String[] args) {
		String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
		
		String beijo = "beijo";
		boolean equals = beijo.toUpperCase().substring(0,1).equals("b");
		System.out.println(beijo);
		System.out.println(equals);
		System.out.println("-----------------------------------------------");
		 
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
