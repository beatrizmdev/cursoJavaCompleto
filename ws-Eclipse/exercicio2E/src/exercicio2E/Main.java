package exercicio2E;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		int codigo = entrada.nextInt();
		int quant = entrada.nextInt();
		double preco, total;
		
		if (codigo == 1) {
			preco = 4.00;
		} else if (codigo == 2) {
			preco = 4.50;
		} else if (codigo == 3) {
			preco = 5.00;
		} else if (codigo == 4) {
			preco = 2.00;
		} else if (codigo == 5) {
			preco = 1.50;
		} else {
			preco = 0.00;
		}
		
		total = preco * quant;
		
		System.out.printf("Total: R$ %.2f", total);
		
		entrada.close();		
	}
}
