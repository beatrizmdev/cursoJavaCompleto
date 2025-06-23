package exercicioH;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		double salario = entrada.nextDouble();
		double imposto = 0.00;

		double p1, p2, p3, p4;
		p1 = p2 = p3 = p4 = 0.00;
		
		if (salario > 4500) {
			p4 = salario - 4500.00;
			p3 = salario - 3000.00 - p4;
			p2 = salario - 2000.00 - p3 - p4;
			p1 = salario - p2 - p3 - p4;
		}
		
		if (salario > 3000.00 && salario < 4500.00) {
			p3 = salario - 3000.00;
			p2 = salario - 2000.00 - p3;
			p1 = salario - p2 - p3;
		}
		
		if (salario > 2000.00 && salario < 3000.00) {
			p2 = salario - 2000.00;
			p1 = salario - p2;
		}
		
		if (salario < 2000.00) {
			p1 = salario;
		}
		
		imposto = (p1 * 0.00 + p2 * 0.08) + (p3 * 0.18) + (p4 * 0.28);
		
		if (imposto == 0.00) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f", imposto);		
		}
		
		entrada.close();
	}	
}
