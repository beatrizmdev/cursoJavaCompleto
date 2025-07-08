package application;

import java.util.Scanner;

import entities.Numbers;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers are you going to enter? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		
		Numbers numbers = new Numbers(vect);
		
		System.out.println("Números negativos:");
		numbers.negatives();
		
		sc.close();
	}

}
