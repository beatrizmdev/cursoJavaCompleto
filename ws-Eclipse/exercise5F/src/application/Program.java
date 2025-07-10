package application;

import java.util.Scanner;

import entities.Vectors;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i=0; i<n; i++) {
			vectA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B:");
		for (int i=0; i<n; i++) {
			vectB[i] = sc.nextInt();
		}
		
		Vectors vectC = new Vectors(vectA, vectB);
		System.out.println("Vetor resultante:");
		vectC.vectC();
		
		sc.close();
	}

}
