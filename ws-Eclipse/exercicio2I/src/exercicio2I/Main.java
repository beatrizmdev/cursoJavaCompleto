package exercicio2I;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		int minutos = entrada.nextInt();
		double pagamento = 50.00;
		
		if (minutos > 100) {
			pagamento += (minutos - 100) * 2.00;
		}
		
		System.out.printf("Valor a pagar: %.2f", pagamento);
		
		entrada.close();
	}
}
