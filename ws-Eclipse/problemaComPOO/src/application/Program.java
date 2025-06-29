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
		
		double areaX = x.area();
		double areaY = y.area();
		
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
