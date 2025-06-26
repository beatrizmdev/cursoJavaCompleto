package estruturadowhile;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		char confirmacao;
		double F;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = entrada.nextDouble();
			F = 9.0 * (C/5.0) + 32;	
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			
			System.out.printf("%nVocê quer converter outro valor? (s/n)  ");
			confirmacao = entrada.next().charAt(0);
		} while (confirmacao != 'n');

		
		
		entrada.close();
	}
}
