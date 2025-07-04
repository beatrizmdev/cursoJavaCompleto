package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product P = new Product(); // para usar o construtor padrão
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product item = new Product(name, price); // você passa a ser obrigado a já fornecer esses valores, dispensando a intanciação.
		
		// agora esse acesso não funcionará, pois os atributos estão privados:
		// item.name = "Fridge"; "The field is not visible"
		// System.out.println(item.name); "The field is not visible"
		
		// deve ser feito dessa maneira:
		item.setName("Fridge");
		System.out.println("Updated name: " + item.getName());
		
		item.setPrice(3000.00);
		System.out.println("Updated price: " + item.getPrice());
		
		System.out.println("Product data: " + item );	
		//System.out.println();
		
		System.out.print("Enter the number os products to be added in stock: ");
		int quantity = sc.nextInt();
		item.addProducts(quantity);
		System.out.println("Updated data: " + item);
		System.out.println();
		
		System.out.print("Enter the number os products to be removed from stock: ");
		quantity = sc.nextInt();
		item.removeProducts(quantity);
		System.out.println("Updated data: " + item);
		
		sc.close();
	}

}
