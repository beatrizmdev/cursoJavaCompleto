package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student aux = new Student();
		
		System.out.print("Insira o nome do aluno: ");
		aux.name = sc.nextLine();
		System.out.println("Insira abaixo as notas do aluno:");
		aux.grade1 = sc.nextDouble();
		aux.grade2 = sc.nextDouble();
		aux.grade3 = sc.nextDouble();
		
		aux.finalGrade();
		System.out.printf("Final grade: %.2f%n", aux.finalGrade());
		
		if (aux.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", aux.situation());
		} 
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
