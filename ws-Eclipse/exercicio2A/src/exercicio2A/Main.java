package exercicio2A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		if (num < 0) {
			System.out.println("Negativo.");
		} else {
			System.out.println("Não negativo");
		}
		
		entrada.close();
	}
}
