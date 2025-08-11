package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		 
		System.out.println("End of program.");
		
		
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***METHOD2 START***");
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Invalid position!");
			
			// O stackTrace te mostra toda a chamada de métodos que acarretou naquele erro
			// ATENÇÃO: mesmo mostrando o que causou o erro, ele segue com o programa graças à estrutura try catch
			error.printStackTrace(); 
			sc.next();
		}
		catch (InputMismatchException error) {
			System.out.println("Input error");
		}
		
		System.out.println("***METHOD2 END***");
		
		sc.close();
	}

}
