package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product item = new Product(name, price, quantity); // você passa a ser obrigado a já fornecer esses valores, dispensando a intanciação.
		
		System.out.println("Product data: " + item );	
		System.out.println();
		
		System.out.print("Enter the number os products to be added in stock: ");
		int aux = sc.nextInt();
		item.addProducts(aux);
		System.out.println("Updated data: " + item);
		System.out.println();
		
		System.out.print("Enter the number os products to be removed from stock: ");
		aux = sc.nextInt();
		item.removeProducts(aux);
		System.out.println("Updated data: " + item);
	
		
		
		sc.close();
	}

}
