package exercicio2B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		if (num % 2 != 0) {
			System.out.println("Ímpar");
		} else {
			System.out.println("Par");
		}
		
		entrada.close();
	}
}
