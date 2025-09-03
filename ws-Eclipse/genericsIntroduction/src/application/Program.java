package application;

import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			Object value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println();
		System.out.println("First: " + ps.first());
		
		// PROBLEMA type safety: não conseguimos guardar nenhuma dessas informações de maneira direta.
		// Para guardar essas infos, tenho que fazer um casting ("int n = ps.first()" n rola pq ta inserindo um object num int)
		// Dentro disso não há a sgurança de tipos em, por exemplo, se eu inserir manualmente "ps.addValue("Maria"), antes do for,
		// teremos um erro de múltiplos tipos, um acaba não podendo fazer casting pra outro, ex: String -> int.
		
		sc.close();
	}

}
