package exercise1E;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu número de identificação: ");
		int id = entrada.nextInt();
		System.out.print("Informe suas horas trabalhadas: ");
		int horas = entrada.nextInt();
		System.out.print("Informe o valor da hora: ");
		double preco = entrada.nextDouble();
		
		double salario = horas * preco;
		
		System.out.println("Number = " + id);
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		entrada.close();
	}
}