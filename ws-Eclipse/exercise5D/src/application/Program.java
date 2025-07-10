package application;

import java.util.Scanner;

import entities.Numbers;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		Numbers vectNum = new Numbers(vect);
		System.out.println();
		System.out.println("Números pares:");
		vectNum.even();		
		
		System.out.printf("%n%nQuantidade de pares = %d", vectNum.evenCount());
		
		sc.close();
	}

}
