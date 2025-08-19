package whileStructure;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		int soma = num;
		
		while (num != 0) {
			num = entrada.nextInt();
			soma += num;
		}
		
		System.out.printf("Finalizado, soma: %d", soma);
		
		entrada.close();
	}
}
