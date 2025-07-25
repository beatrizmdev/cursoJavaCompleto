package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		
		System.out.println("Enter the worker data:");
		System.out.print("Name: ");
		String aux_name = sc.nextLine();
		System.out.print("Level: ");
		String aux_level = sc.nextLine();
		System.out.print("Base salary: ");
		double aux_baseSalary = sc.nextDouble();
		System.out.print("How many contracts for this worker? ");
		int quant = sc.nextInt();
		System.out.println();
		Worker worker = new Worker(aux_name, WorkerLevel.valueOf(aux_level), aux_baseSalary, new Department(department));
		
		/*
		 * 	Atenção ao que realmente foi feito aqui:
		 * 	Instanciamos um novo OBJETO do tipo Worker. Os dados desse objeto são: nome, level, salário base, departamento.
		 *  - nome e salário são atributos de tipo primitivo então são declarados e enviados normalmente.
		 *  - level é um Enum, uma classe não comum de tipo fixo (constante) e fechado (não se pode adicionar um novo valor àquele arquivo Enum).
		 * 	Assim, não podemos instanciar com "new WorkerLevel", precisamos converter um valor String para valor DO ENUM (um dos previamente definidos).
		 *  - departamento instanciamos com "new Department(department)" porque é uma classe comum e tem um construtor público.
		 *  Então você pode criar um novo objeto dessa classe através de instanciação
		 */		
				
		for (int i=0; i<quant; i++) {
			
			System.out.println("Enter contract #" + (i+1) + " data:");
			System.out.print("Date (DD/MM/YY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			Double aux_valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int aux_hours = sc.nextInt();
			System.out.println();
			
			HourContract contract = new HourContract(contractDate, aux_valuePerHour, aux_hours);
			worker.addContract(contract);
			
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String searchedDate = sc.next();
		int month = Integer.parseInt(searchedDate.substring(0,2));
		int year = Integer.parseInt(searchedDate.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + searchedDate + ": " + String.format("%.2f", worker.income(month, year)));
				
		sc.close();;
	}

}