package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat f2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		Client client = new Client(name, email, f1.parse(birthDate));
		
		System.out.println();
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		Date moment = new Date();
		Order order = new Order(moment, OrderStatus.valueOf(status));
		System.out.print("How many items to this order? ");
		int quant = sc.nextInt();
		System.out.println();

		
		for (int i=1; i<=quant; i++) {
			
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int prodQuantity = sc.nextInt();
			System.out.println();
			
			OrderItem item = new OrderItem(prodName, prodPrice, prodQuantity);
			order.addItem(item);			
		}
		
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + f2.format(order.getMoment()));
		System.out.println("Order status: " + OrderStatus.valueOf(status));
		System.out.print(client);
		System.out.println();
		System.out.println("Order items:");
		order.printingItemsInfo();
		System.out.print("Total price: $" + String.format("%.2f", order.total()));
		
		
		sc.close();
	}

}
