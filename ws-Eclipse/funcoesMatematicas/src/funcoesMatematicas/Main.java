package funcoesMatematicas;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// A = Math.sqrt(x); variável A recebe raiz quadrada de X
		// A = Math.pow(x, y); variável A recebe o resultado de x elevado a y
		// A = Math.abs(x); variável A recebe o valor absoluto de x
		
		double num1 = 3.0;
		double num2 = 4.0;
		double num3 = -5.0;
		double result1, result2, result3;
		
		result1 = Math.sqrt(num1);
		result2 = Math.sqrt(num2);
		result3 = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + num1 + " = " + result1);
		System.out.println("Raiz quadrada de " + num2 + " = " + result2);
		System.out.println("Raiz quadrada de 25 " + " = " + result3);
	
		result1 = Math.pow(num1, num2);
		result2 = Math.pow(num1, 2.0);
		result3 = Math.pow(5.0, 2.0);
		
		System.out.println(num1 + " elevado a  " + num2 + " = " + result1);
		System.out.println(num1 + " elevado ao quadrado = " + result2);
		System.out.println("5 elevado ao quadrado = " + result3);
	
		result1 = Math.abs(num2);
		result2 = Math.abs(num3);
		
		System.out.println("O valor absoluto de " + num2 + " = " + result1);
		System.out.println("O valor absoluto de " + num3 + " = " + result2);
		
		// incluindo funções em expressões maiores		
		Scanner entrada = new Scanner(System.in); // aqui estamos associando o nosso objeto Scanner ao teclado no modo console
		
		double a, b, c;
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		
		double delta = Math.pow(b, 2.0) - 4*a*c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0 * a); 
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
		entrada.close();

	}
}
