package entradaDeDados;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// Lendo uma palavra
		/*
		Scanner entrada = new Scanner(System.in); // aqui estamos associando o nosso objeto Scanner ao teclado no modo console
		
		String x;
		x = entrada.next(); // isso vai permitir que eu digite uma palavra e ela seja armazenada na variável 
		
		System.out.println("Você digitou: " + x);
		
		entrada.close(); 
		*/
		
		// Lendo uma int
		/*
		Scanner entrada = new Scanner(System.in); // aqui estamos associando o nosso objeto Scanner ao teclado no modo console
		
		int x;
		x = entrada.nextInt(); // adicionamos o "Int"
		
		System.out.println("Você digitou: " + x);
		
		entrada.close(); 
		*/
		
		// Lendo um double
		/*
		Scanner entrada = new Scanner(System.in); // aqui estamos associando o nosso objeto Scanner ao teclado no modo console
		
		double x;
		x = entrada.nextDouble(); // adicionamos o "Double"
		
		System.out.println("Você digitou: " + x); // OBS: ele usa a localidade do sistema pra definir , ou .
		System.out.printf("Você digitou: %.2f%n", x);
		
		entrada.close(); 
		*/
		
		// Lendo um char
		/*
		Scanner entrada = new Scanner(System.in); // aqui estamos associando o nosso objeto Scanner ao teclado no modo console
		
		char x;
		x = entrada.next().charAt(0); // adicionamos o ".charAt(0)"
		
		System.out.println("Você digitou: " + x); 
		
		entrada.close(); 
		*/
		
		// Lendo vários dados na mesma linha
		/*
		Scanner entrada = new Scanner(System.in); // aqui estamos associando o nosso objeto Scanner ao teclado no modo console
		
		String x;
		int y;
		double z;
		
		x = entrada.next(); 
		y = entrada.nextInt(); 
		z = entrada.nextDouble(); 
		
		System.out.println("Você digitou: "); 
		System.out.println("x: " + x); 
		System.out.println("y: " + y); 
		System.out.println("z: " + z); 
		
		entrada.close(); 
		*/
		
		// lendo texto até a quebra de linha (lê uma linha inteira)
		/*
		Scanner entrada = new Scanner(System.in);
		String s1, s2, s3;
		
		s1 = entrada.nextLine(); // adicionamos o "Line"
		s2 = entrada.nextLine();
		s3 = entrada.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		entrada.close();
		*/		
		
		// ATENÇÃO! Quebra de linha pendente
		
		Scanner entrada = new Scanner(System.in);
		String s1, s2, s3;
		int x; 
		
		x = entrada.nextInt(); // qualquer outra, sendo diferente de nextLine, vai dar esse problema
		entrada.nextLine(); // essa fica de step pra consumir o "enter" sem estragar o fluxo desejado
		s1 = entrada.nextLine(); // adicionamos o "Line"
		s2 = entrada.nextLine();
		s3 = entrada.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		entrada.close();
	}
}
