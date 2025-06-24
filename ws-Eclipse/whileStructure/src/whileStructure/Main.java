package whileStructure;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		while (num != 0) {
			num = entrada.nextInt();
		}
		
		System.out.println("Finalizado");
		
		entrada.close();
	}
}
