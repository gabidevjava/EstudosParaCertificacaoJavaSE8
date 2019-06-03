package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TesteData8 {
	
	private static LocalDate withMonth;

	/*LocalData = Data sem hora
	LocalTime = Hora
	LocalDataTime = Data com hora
	MonthDay = Dia de um mês
	YearMonth = Mês e ano*/
	
	public static void main(String[] args) {
		//LocalDate d = LocalDate.now();
		/*LocalDateTime dh = LocalDateTime.now();
		System.out.println(d);
		System.out.println(h);
		System.out.println(dh);*/
		
		/*LocalTime t1 = LocalTime.now(ZoneId.of("America/Chicago"));
		System.out.println(t1);
		LocalTime t2 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
		System.out.println(t2);
		LocalTime meioDia = LocalTime.of(12, 0);
		System.out.println(meioDia);
		LocalDate meuAniversario = LocalDate.of(2018, 06, 19);
		System.out.println(meuAniversario);
		LocalDate meuAniversario2 = LocalDate.of(2018, Month.JUNE, 19);
		System.out.println(meuAniversario2.getDayOfMonth());*/
		
		MonthDay day1 = MonthDay.of(1, 1);
		MonthDay day2 = MonthDay.of(1, 2);
		
		//System.out.println(day1.isBefore(day2));
		//System.out.println(day1.isAfter(day2));
		//System.out.println(day1.isEqual(day2));
		
		/*LocalDate d = LocalDate.of(2018, 4, 21);
		
		System.out.println(d);
		
		LocalDate withMonth2 = d.withMonth(6);
		
		System.out.println(withMonth2);*/
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatter.format(agora));
		System.out.println(agora.format(formatter));		
		
				
				
	}

}
