package exercicio3A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		if (num < 1 || num > 1000) {
			System.out.println("Número inválido! Tente novamente");
			num = entrada.nextInt();
		}
		
		for (int i=0; i<num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		entrada.close();
	}
}
