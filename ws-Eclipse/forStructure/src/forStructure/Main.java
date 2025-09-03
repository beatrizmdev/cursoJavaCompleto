package forStructure;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int quant = entrada.nextInt();
		int soma = 0;
		
		for (int i=0; i<quant; i++) {
			int num = entrada.nextInt();
			soma += num;
		}
		
		System.out.printf("Soma: %d", soma);
		
		entrada.close();
	}
}