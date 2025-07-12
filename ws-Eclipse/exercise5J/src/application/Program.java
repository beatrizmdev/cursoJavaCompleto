package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		
		int n = sc.nextInt();	
		String[] name = new String[n];
		double[] grade1 = new double[n];
		double[] grade2 = new double[n];
		
		for (int i=0; i<name.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
			sc.nextLine();	
			name[i] = sc.nextLine();
			grade1[i] = sc.nextDouble();
			grade2[i] = sc.nextDouble();
		}
		
		Students students = new Students(name, grade1, grade2);
		System.out.println("Alunos aprovados:");
		students.approved();
	}

}
