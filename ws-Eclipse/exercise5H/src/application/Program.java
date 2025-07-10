package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Average;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		for (int i=0; i<num.length; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextInt();
		}
		
		Average avg = new Average(num);
		avg.avg();
		
		sc.close();
	}

}
