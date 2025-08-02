package exercicio2G;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);	
		double x = entrada.nextDouble();
		double y = entrada.nextDouble();
		
		if (x == 0.00 && y == 0.00) {
			System.out.println("Na origem");
		} else if (x == 0.00) {
			System.out.println("Eixo X");
		} else if (y == 0.00) {
			System.out.println("Eixo Y");
		}
		
		if (x > 0.00 && y > 0.00) {
			System.out.println("Q1");
		}
		
		if (x > 0.00 && y < 0.00) {
			System.out.println("Q4");
		}
		
		if (x < 0.00 && y > 0.00) {
			System.out.println("Q2");
		}
		
		if (x < 0.00 && y < 0.00) {
			System.out.println("Q3");
		}
		
		entrada.close();
	}
}