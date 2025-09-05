package application;

import java.util.Scanner;

import entities.Numbers;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers are you going to enter? ");
		int quant = sc.nextInt();
		
		int[] vect = new int[quant];
		for (int i=0; i<vect.length; i++) {
			System.out.println("Enter the number:");
			vect[i] = sc.nextInt();
		}
		
		Numbers number = new Numbers(vect);
		System.out.println();
		System.out.println("Números negativos:");
		number.negative();
	
		sc.close();
	}

}
