package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, limit);
			
		System.out.println();
		System.out.print("Enter amount for withdraw:");
		double amount = sc.nextDouble();
		
		// não é bom isso de retornar um String e fazer a validação através disso
		String error = acc.validateWithdraw(amount);
		if (error != null) {
			System.out.println(error);
		}
		else {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f%n", acc.getBalance());
		}
		
		sc.close();
		
	}

}
