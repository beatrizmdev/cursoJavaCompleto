package exercicio3D;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		int quant = entrada.nextInt();
		
		for (int i=0; i<quant; i++) {
			int num1 = entrada.nextInt();
			int num2 = entrada.nextInt();
			
			if (num2 == 0) {
				System.out.println("Divisão impossível!");
			} else {
				double divisao = (double) num1/num2;
			}
		}
		
		entrada.close();
	}
}
