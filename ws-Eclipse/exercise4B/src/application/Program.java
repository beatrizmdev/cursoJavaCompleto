package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee aux = new Employee();
		
		System.out.print("Name: ");
		aux.name = sc.nextLine();
		System.out.print("Gross salary: ");
		aux.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		aux.tax = sc.nextDouble();
		
		aux.netSalary();
		
		System.out.println();
		System.out.print("Employee: ");
		System.out.println(aux);
		
		System.out.println();
		System.out.print("Wich percentage to increase salary? ");
		aux.percentage = sc.nextDouble();
		
		aux.increaseSalary();
		aux.netSalary();
		
		System.out.println();
		System.out.print("Data update: ");
		System.out.println(aux);;
		
		sc.close();
	}

}
