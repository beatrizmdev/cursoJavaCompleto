package operadoresLogicosBitABit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		//--------------------------------------------------------
		
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		int mask = 32; // 0010 0000 (sexto bit é 1)
		
		if ((num & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		
		entrada.close();
	}

}
