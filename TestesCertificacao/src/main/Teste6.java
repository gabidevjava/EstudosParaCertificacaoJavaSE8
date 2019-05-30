package main;

import java.util.ArrayList;
import java.util.List;
 
public class Teste6 {
     public static void main(String[] args) {
         List<String> list1 = new ArrayList<>();
         list1.add("A");
         list1.add("D");
         
         System.out.println(list1);
 
         List<String> list2 = new ArrayList<>();
         list2.add("B");
         list2.add("C");
         
         System.out.println(list2);
 
         list1.addAll(1, list2);
 
         System.out.println(list1);
     }
}
