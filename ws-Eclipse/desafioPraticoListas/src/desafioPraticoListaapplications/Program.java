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
		
		System.out.print("How many employees will be registered? ");
		int quant = sc.nextInt();
		System.out.println();
		
		List <Employeers> list = new ArrayList<>();
		
		for (int i=0; i<quant; i++) {
			System.out.print("Employee #" + (i+1) + ":");
			System.out.println();
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			list.add(new Employeers(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int auxId = sc.nextInt();
		
		if (position(list, auxId) == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(position(list, auxId)).increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employeers emp : list) {
			System.out.println(emp);
		}

		sc.close();
	}

	public static Integer position(List<Employeers> list, int id) {
		for(int i=0; i<list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
