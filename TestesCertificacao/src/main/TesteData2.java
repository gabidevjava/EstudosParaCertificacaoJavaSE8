package main;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
 
public class TesteData2 {
     public static void main(String[] args) {
         List<LocalDate> dates = new ArrayList<>();
         dates.add(LocalDate.parse("2018-07-11"));
         dates.add(LocalDate.parse("1919-02-25"));
         dates.add(LocalDate.of(2020, 4, 8));
         dates.add(LocalDate.of(1980, Month.DECEMBER, 31));
 
         dates.removeIf(x -> x.getYear() < 2000);
 
         System.out.println(dates);
     }
}


