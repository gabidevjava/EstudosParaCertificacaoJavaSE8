package main;

import java.util.ArrayList;
import java.util.List;
 
public class Teste5 {
	
     public static void main(String[] args) {
         List<Character> list = new ArrayList<>();
         list.add(0, 'V');
         list.add('T');
         list.add(1, 'E');
         list.add(3, 'O');
         
         System.out.println(list);
 
         if(list.contains('O')) {
             list.remove('O');
         }
 
         for(char ch : list) {
             System.out.print(ch);
         }
     }
}
