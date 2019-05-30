package main;

import java.time.LocalDateTime;

public class TesteData1 {
	
     public static void main(String [] args) {
         LocalDateTime obj = LocalDateTime.now();
         System.out.println(obj.getSecond());
     }
}