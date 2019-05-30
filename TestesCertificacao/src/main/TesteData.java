package main;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
 
public class TesteData {
     public static void main(String [] args) {
         LocalDate date = LocalDate.of(2012, 1, 11);
         Period period = Period.ofMonths(2);
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
         System.out.print(formatter.format(date.minus(period)));
     }
}
