package exercicio3G;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		for (int i=1; i <=num; i++) {
			int i2 = i*i;
			int i3 = i*i*i;			
			System.out.println(i + " " + i2 + " " + i3);
		}
		
		entrada.close();
	}
}