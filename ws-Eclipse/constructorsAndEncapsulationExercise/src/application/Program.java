package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Register;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Register register;
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		char confirmID;
				
		System.out.print("Is there a initial deposit (y/n)? ");
		confirmID = sc.next().charAt(0);
			
		if (confirmID == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			register = new Register(accountNumber, holder, initialDeposit);
		}
		else {
			register = new Register(accountNumber, holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(register);		
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double aux = sc.nextDouble();
		register.deposit(aux);
		System.out.println("Updated account data:");
		System.out.println(register);	
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		aux = sc.nextDouble();
		register.withdraw(aux);
		System.out.println("Updated account data:");
		System.out.println(register);

		sc.close();
	}

}
