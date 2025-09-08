package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>(); // quando usamos o TreeSet, a classe do conjunto tem que ser do comparable
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		// vai ordenar esses produtos
		for (Product p : set) {
			System.out.println(p);
		}
	}
}