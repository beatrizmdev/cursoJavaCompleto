package exercicio1B;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");		
		int num1 = entrada.nextInt();
		System.out.print("Informe o segundo valor: ");
		int num2 = entrada.nextInt();
		
		int soma = num1 + num2;
		System.out.println("Soma = " + soma);
		
		entrada.close();
	}
}
