package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		// função anônima ou arrow function:
		// (parâmetros) -> { implementação da função }
		// nos parâmetros não precisa informar o tipo
		
		
		Comparator<Product> comp = (p1, p2) -> { // faremos uma implementação de expressão lambda, criando uma função anônima
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		
		/*
		 * OBS: como a implementação tem apenas uma linha, posso também dispensar o "return" e as chaves, deixando dessa forma:
		 * 
		 * Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		 * 
		 */

		list.sort(comp);
		
		for (Product p : list) {
			System.out.println(p);
		}
			
	}
}