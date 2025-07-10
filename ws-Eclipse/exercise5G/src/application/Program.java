package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Grades;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] num = new double[n];
		for (int i=0; i<num.length; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextDouble();
		}
		
		Grades grades = new Grades(num);
		System.out.printf("%nMédia do vetor = %.3f%n", grades.avg());
		System.out.println("Elementos abaixo da média:");
		grades.bellowAvg();
		
		sc.close();
	}

}
