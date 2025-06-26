package exercicio3B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quant = entrada.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i=0; i<quant; i++) {
			int num = entrada.nextInt();
			
			if (num >= 10 && num <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		entrada.close();
	}
}
