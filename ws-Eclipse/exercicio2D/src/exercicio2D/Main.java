package exercicio2D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int inicio = entrada.nextInt();
		int fim = entrada.nextInt();
		int valorSoma, tempoTotal;
		
		if (inicio > fim) {
			valorSoma = 24 - inicio;
			tempoTotal = fim + valorSoma;
			
			System.out.printf("O jogo durou %d hora(s).", tempoTotal);
		} else if (inicio < fim) {
			tempoTotal = fim - inicio;
			System.out.printf("O jogo durou %d hora(s).", tempoTotal);
		} else {
			tempoTotal = 24;
			System.out.printf("O jogo durou %d hora(s).", tempoTotal);			
		}
		
		entrada.close();
	}
}
