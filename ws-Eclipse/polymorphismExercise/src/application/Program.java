package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;
import entities.OutsourcedEmployees;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the number os employees: ");
		int quant = sc.nextInt();
		
		List<Employees> employees = new ArrayList<>();
		
		for(int i=1; i<=quant; i++) {
			sc.nextLine();
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double vph = sc.nextDouble();
						
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				OutsourcedEmployees outEmp = new OutsourcedEmployees(name, hours, vph, additionalCharge);
				employees.add(outEmp);
				System.out.println();
			}
			else {
				Employees emp = new Employees(name, hours, vph);
				employees.add(emp);
				System.out.println();
			}
			
		}
		
		System.out.println("PAYMENTS:");
		
		for(Employees emp : employees) {
			System.out.print(emp.getName() 
							+ " - $ " 
							+ String.format("%.2f", emp.payment()));
			System.out.println();

		}
		
		sc.close();
	}
}
