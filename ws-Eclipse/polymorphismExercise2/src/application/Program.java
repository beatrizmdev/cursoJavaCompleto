package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			sc.nextLine();
			System.out.println("Product #"+ i +" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				ImportedProduct impProd = new ImportedProduct(name, price, customsFee);
				products.add(impProd);
			}
			else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				UsedProduct usedProd = new UsedProduct(name, price, date);
				products.add(usedProd);
			}
			else {
				Product prod = new Product(name, price);
				products.add(prod);
			}
			
			System.out.println();
		}
		
		System.out.println("PRICE TAGS:");
		
		for(Product prod : products) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
