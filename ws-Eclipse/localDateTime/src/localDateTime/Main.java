package localDateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate d01 = LocalDate.now(); // data hoje aqui agora
		LocalDateTime d02 = LocalDateTime.now(); // horário agora aqui
		Instant d03 = Instant.now(); // data horário agora em Londres
		
		LocalDate d04 = LocalDate.parse("2025-07-17"); // conversão de horário em ISO8601 
		LocalDateTime d05 = LocalDateTime.parse("2025-07-17T01:30:26"); // conversão de horário data em ISO8601 
		Instant d06 = Instant.parse("2025-07-17T01:30:26Z"); // data horário agora em Londres
		Instant d07 = Instant.parse("2025-07-17T01:30:26-03:00"); // data horário agora em Londres mas convertendo

		LocalDate d08 = LocalDate.parse("20/07/2025", fmt1); // captando uma data num formato "customizado". Pesquisar sobre "DateTimeFormatter"
		// LocalDate d08 = LocalDate.parse("20/07/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy")); // Também pode ser feito assim diretamente
		LocalDateTime d09 = LocalDateTime.parse("20/07/2025 01:30", fmt2); // conversão de horário data em um formato "customizado".
		
		LocalDate d10 = LocalDate.of(2022, 7, 20); // instanciando datas a partir de dados isolados
		LocalDateTime d11 = LocalDateTime.of(2025, 7, 20, 1, 30); // instanciando datas e horas a partir de dados isolados
		
		System.out.println("d01: " + d01);
		System.out.println("d02: " + d02);
		System.out.println("d03: " + d03);
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		System.out.println("d08: " + d08);
		System.out.println("d09: " + d09);
		System.out.println("d10: " + d10);
		System.out.println("d11: " + d11);

	}

}
