package estruturaTernaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		double preco = entrada.nextDouble();
		double desconto;
/*		
		if (preco < 20.0) {
		desconto = preco * 0.1;
		}
		else {
		desconto = preco * 0.05;
		}
*/
		
		desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;		
		System.out.println(desconto);
		
		entrada.close();
	}
}
