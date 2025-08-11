package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyAccount;
import entities.IndividualAccount;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int quant = sc.nextInt();
		
		for (int i=1; i<=quant; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				
				IndividualAccount individualAcc = new IndividualAccount(name, anualIncome, health);
				list.add(individualAcc);
			}
			if (ch == 'c') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				
				CompanyAccount companyAcc = new CompanyAccount(name, anualIncome, employees);
				list.add(companyAcc);
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");		
		for (TaxPayer payer : list) {
			System.out.printf(payer.getName() + ": $ %.2f%n", payer.Tax());
		}
		
		double sum = 0.0;
		for (TaxPayer payer : list) {
			sum += payer.Tax();			
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		sc.close();
		
	}

}
