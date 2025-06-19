package exercicio1A;
import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a largura: ");
		double largura = entrada.nextDouble();
		
		System.out.print("Informe o comprimento: ");	
		double comprimento = entrada.nextDouble();
		
		System.out.print("Informe o valor do metro quadrado: ");	
		double metroQuadrado = entrada.nextDouble();
		System.out.println("---------------------------");
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);
		
		entrada.close();
	}
}
