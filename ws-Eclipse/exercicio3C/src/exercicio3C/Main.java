package exercicio3C;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		int quant = entrada.nextInt();
		double media = 0.00;
		
		for (int i=0; i<quant; i++) {
			double num1 = entrada.nextDouble();			
			double num2 = entrada.nextDouble();
			double num3 = entrada.nextDouble();
			
			media = ((num1*2) + (num2*3) + (num3*5)) / (2+3+5);
			System.out.printf("%.1f%n", media);
		}
		
		entrada.close();
	}
}
