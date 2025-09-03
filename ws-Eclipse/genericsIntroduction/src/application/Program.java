package application;

import java.util.Scanner;

import entities.PrintServiceString;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PrintServiceString ps = new PrintServiceString();
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}

}
