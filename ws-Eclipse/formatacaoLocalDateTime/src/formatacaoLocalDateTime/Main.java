package formatacaoLocalDateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2025-07-18");
		LocalDateTime d05 = LocalDateTime.parse("2025-07-18T01:30:26");
		Instant d06 = Instant.parse("2025-07-18T01:30:26Z");
		
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // pega e considera o horário da máquina do usuário para definir o fuso horário GMT
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // direto da documentação (modelos prontos)
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // direto da documentação (modelos prontos), agora suportando Instant

		// formas de mostrar essa data formatada
		System.out.println("d04 = " + d04);
		System.out.println("d04.format(fmt1) = " + d04.format(fmt1));
		System.out.println("fmt1.format(d04) = " + fmt1.format(d04));
		System.out.println("d04.format(todo o obj) = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println();
		
		System.out.println("d05.format(fmt1) = " + d05.format(fmt1));
		System.out.println("d05.format(fmt2) = " + d05.format(fmt2));

		System.out.println();
		
		System.out.println("d06 = " + d06);
		// System.out.println("d06 = " + d06.format()); // não funciona só com o .format() pq no Instant, a hora depende do local, fica ambíguo, então essa classe n tem o método .format()
		System.out.println("d06 = " + fmt3.format(d06));

		System.out.println();
		
		System.out.println("d05.format(fmt4) = " + d05.format(fmt4));
		// System.out.println("d05.format(fmt4) = " + fmt4.format(d06)); // também n funcionaria pq d06 é um Instant, a formatação precisa tratar do fuso horário
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d06 = " + d06.toString()); // também funciona 
	}
}
