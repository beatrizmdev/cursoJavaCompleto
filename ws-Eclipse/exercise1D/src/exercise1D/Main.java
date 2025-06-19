package exercise1D;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o num 1: ");
		int num1 = entrada.nextInt();
		System.out.print("Informe o num 2: ");
		int num2 = entrada.nextInt();
		System.out.print("Informe o num 3: ");
		int num3 = entrada.nextInt();
		System.out.print("Informe o num 4: ");
		int num4 = entrada.nextInt();
		
		int diferenca = ((num1 * num2) - (num3 * num4));
		
		System.out.println("Diferença = " + diferenca);
		
		entrada.close();
	}
}
