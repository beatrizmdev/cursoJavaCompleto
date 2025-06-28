package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the X triangle measures: ");	
		x.a = entrada.nextDouble();
		x.b = entrada.nextDouble();
		x.c = entrada.nextDouble();
		
		System.out.println("Now enter the Y triangle measures: ");
		y.a = entrada.nextDouble();
		y.b = entrada.nextDouble();
		y.c = entrada.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.00;
		double areaX = Math.sqrt(p * (p-x.a) * (p-x.b) * (p-x.c));
		p = (y.a + y.b + y.c) / 2.00;
		double areaY = Math.sqrt(p * (p-y.a) * (p-y.b) * (p-y.c));
		
		System.out.printf("X triangle area: %.4f%n", areaX);
		System.out.printf("Y triangle area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		entrada.close();

	}

}
