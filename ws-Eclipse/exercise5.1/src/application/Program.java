package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers are you going to enter? ");
		int quant = sc.nextInt();

		int[] vect = new int[quant];
		for (int i=0; i<quant; i++) {
			System.out.print("Enter a number: ");
			int num = sc.nextInt();
			vect[i] = num;
		}
		
		System.out.println();
		System.out.println("Negative numbers:");
		for (int i=0; i<quant; i++) {
			if (vect[i]<0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
