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
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		Numbers vect2 = new Numbers(vect);
		vect2.printing();
		
		System.out.printf("%nSum: %.2f", vect2.sum());
		
		System.out.printf("%nAverage: %.2f", vect2.avg());
		
		sc.close();
	}

}
