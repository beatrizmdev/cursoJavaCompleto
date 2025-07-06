package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		// Note o uso do vect.length ao invés de uma variável n
		// É melhor usar essa função pra deixar o código +coeso,
		// não precisando de uma nova var q não tá atrelada ao vetor.
		for (int i=0; i<vect.length; i++) {  
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double avg = 0;
		for (int i=0; i<vect.length; i++) {
			avg += vect[i].getPrice();
		}
		avg /= vect.length;
		
		System.out.printf("Average price: %.2f", avg);
		
		System.out.println();
		
		sc.close();
	}

}
