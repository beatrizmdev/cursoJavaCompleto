package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product item = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		item.name = sc.nextLine();
		System.out.print("Price: ");
		item.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		item.quantity = sc.nextInt();
		
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
