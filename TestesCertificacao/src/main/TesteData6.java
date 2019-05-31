package main;

import java.time.LocalDate;

class MyLocalDate extends LocalDate {
     @Override
     public String toString() {
         return super.getDayOfMonth() + "-" + super.getMonthValue() + 
            "-" +  super.getYear();
     }
}
 
public class TesteData6 {
     public static void main(String [] args) {
         MyLocalDate date = LocalDate.parse("1980-03-16");
         System.out.println(date);
     }
}