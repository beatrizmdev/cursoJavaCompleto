package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("How many rooms will be rented? ");
		int quant = sc.nextInt();
		
		Rent[] rent = new Rent[10];
		
		for (int i=0; i<quant; i++) {
			sc.nextLine();
			sc.nextLine();
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			num = sc.nextInt();
			rent[num] = new Rent(name, email);			
		}
		
		sc.nextLine();
		System.out.println("Busy rooms:");
		for (int i=0; i<rent.length; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}
		
		sc.close();
	}

}
