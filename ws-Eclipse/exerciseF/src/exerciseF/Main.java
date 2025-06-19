package exerciseF;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int codigo1 = entrada.nextInt();
		int quant1 = entrada.nextInt();
		double valor1 = entrada.nextDouble();
		
		int codigo2 = entrada.nextInt();
		int quant2 = entrada.nextInt();
		double valor2 = entrada.nextDouble();
		
		double pagar = (quant1 * valor1) + (quant2 * valor2);
		
		System.out.printf("Valor a pagar: R$ %.2f", pagar);
		
		entrada.close();
		
	}
}
