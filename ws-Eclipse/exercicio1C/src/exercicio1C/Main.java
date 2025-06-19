package exercicio1C;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o raio: ");
		double raio = entrada.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2.0);
		System.out.printf("Área = %.4f", area);
		
		entrada.close();
	}
}
