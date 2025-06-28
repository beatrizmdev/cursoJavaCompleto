package funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		
		int higher = max(num1, num2, num3);
		
		showResult(higher);
		
		entrada.close();
	}
	
	public static int max(int a, int b, int c) {
		int aux;
		
		if (a>b && a>c) {
			aux = a;
		}
		else if(b>c) {
			aux = b;
		}
		else {
			aux = c;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher: " + value);
	}
}
