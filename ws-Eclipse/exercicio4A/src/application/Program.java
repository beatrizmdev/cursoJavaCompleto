package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle medidas = new Rectangle();
		
		System.out.println("Enter retangle width and height:");
		medidas.width = sc.nextDouble();
		medidas.height = sc.nextDouble();
				
		System.out.printf("Area = %.2f", medidas.area());
		System.out.println();
		System.out.printf("Perimeter = %.2f", medidas.perimeter());
		System.out.println();
		System.out.printf("Area = %.2f", medidas.diagonal());
		
		sc.close();
	}

}
