package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Numbers;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		Numbers num = new Numbers(vect);
		System.out.printf("%nMaior valor: %.1f%n", num.highest());
		System.out.print("Posição do maior valor: " + num.highID());
		
		sc.close();
	}

}
