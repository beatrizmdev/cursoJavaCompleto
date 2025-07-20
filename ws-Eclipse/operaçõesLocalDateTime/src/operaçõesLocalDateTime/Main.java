package operaçõesLocalDateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		// operações importantes com data-hora
		
		LocalDate d04 = LocalDate.parse("2025-07-18");
		LocalDateTime d05 = LocalDateTime.parse("2025-07-18T01:30:26");
		Instant d06 = Instant.parse("2025-07-19T01:30:26Z");
		
		// pegar uma semana antes da data
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeelLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeelLocalDate = " + nextWeelLocalDate);
		
		System.out.println("---------------");
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeelLocalDateTime = d05.plusDays(7);
	
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeelLocalDateTime = " + nextWeelLocalDateTime);

		System.out.println("---------------");
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // a classe Instant não tem o método minusDays()
		Instant nextWeelInstant = d06.plus(7, ChronoUnit.DAYS);
	
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeelInstant = " + nextWeelInstant);
		
		System.out.println("---------------"); // duração
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0, 0));
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant); // ao contrário: dia do passado - dia do futuro
		
		System.out.println("t1 = " + t1.toDays()); // dá erro pois não suporta segundos, precisa do ".atTime(0, 0)" ou ".atStartOfDay()"
		System.out.println("t2 = " + t2.toDays());	
		System.out.println("t3 = " + t3.toDays());
		System.out.println("t4 = " + t4.toDays());		

	}
	
}
