package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dolar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dolars will be bought? ");
		double boughtAmount = sc.nextDouble();
		
		double toBePaid = CurrencyConverter.pricing(price, boughtAmount);
		
		System.out.printf("Amount to be paid in reais:  %.2f", toBePaid);
				
		sc.close();

	}

}
