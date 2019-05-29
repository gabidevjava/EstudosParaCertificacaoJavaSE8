package main;

import java.util.ArrayList;
import java.util.List;
 
public class Teste1 {
	
     public static void main(String[] args) {
         String s = new String("Hello");
         List<String> list = new ArrayList<>();
         list.add(s);
         list.add(new String("Hello"));
         list.add(s);
         String replace1 = s.replace("l", "L");
         	
         System.out.println(replace1 + " :) ");
         System.out.println(list);
     }
}