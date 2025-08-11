package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * String[] vect = sc.nextLine().split(" ");
		 * int position = sc.nextInt();
		 *
		 * System.out.println(vect[position]);
		 */
		
		/*
		 * Possíveis erros aqui:
		 * 1º ArrayIndexOutOfBoundsException: se o position estiver fora do escolpo do vetor
		 * 2º InputMismatchException: se no momento de inserir o valor de position, a pessoa digitar uma letra, ou palavra, ou double, etc.
		 * 
		 * Para resolver, usaremos a estrutura try catch
		 */
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Invalid position!");
		}
		catch (InputMismatchException error) {
			System.out.println("Input error");
		}
		 
		System.out.println("End of program.");
		
		sc.close();
	}

}
