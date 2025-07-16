package desafioPraticoListaapplications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employeers;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.print ("How many employees will be registered? ");
		int quant = sc.nextInt();
		
		List <Employeers> list = new ArrayList<>();
		
		for (int i=0; i<quant; i++) {
			sc.next();
			System.out.print("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			list.add(new Employeers(id, name, salary));
		}
		
		// System.out.print("Enter the employee id that will have salary increase: ");
		
		sc.close();
	}

}
