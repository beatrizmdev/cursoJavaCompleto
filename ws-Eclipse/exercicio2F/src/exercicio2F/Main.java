package exercicio2F;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		double num = entrada.nextDouble();
		
		if (num >= 0) {
			if (num <= 25) {
				System.out.println("Intervalo [0,25]");
			} else if (num <= 50) {
				System.out.println("Intervalo (25,50]");
			} else if (num <= 75) {
				System.out.println("Intervalo (50,75]");
			} else if (num <= 100) {
				System.out.println("Intervalo (75,100]");
			}
		} else {
			System.out.println("Fora de intervalo");
		}
		
		entrada.close();
	}
}
