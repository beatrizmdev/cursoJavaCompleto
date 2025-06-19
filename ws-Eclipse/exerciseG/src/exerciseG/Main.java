package exerciseG;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		double num3 = entrada.nextDouble();
		
		double triangulo = (num1 * num3)/2;
		double circulo = 3.14159 * Math.pow(num3, 2.0);
		double trapezio = (num1 + num2) * (num3/2);
		double quadrado = Math.pow(num2, 2.0);
		double retangulo = num1 * num2;
		
		System.out.printf("Triângulo: %.3f%n", triangulo);
		System.out.printf("Círculo: %.3f%n", circulo);
		System.out.printf("Trapézio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retângulo: %.3f%n", retangulo);
		
		entrada.close();
	}
}