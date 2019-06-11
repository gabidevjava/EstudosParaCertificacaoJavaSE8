package main;

import java.time.LocalDate;
import java.time.Period;

public class Agora {

	public static void main(String[] args) throws Exception {
		LocalDate date = LocalDate.parse("4000-01-01");
		System.out.println(date);
        Period period = Period.ofYears(-3000);
        System.out.println(period);
        //System.out.println(date.plus(period));
		
	}
}
