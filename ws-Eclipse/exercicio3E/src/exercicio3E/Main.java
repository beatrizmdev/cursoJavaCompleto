package exercicio3E;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		int resultado = 1;
		
		for(int i=1; i<=num; i++) {
			resultado *= i;
		}
		
		System.out.println(resultado);
		
		entrada.close();
	}

}