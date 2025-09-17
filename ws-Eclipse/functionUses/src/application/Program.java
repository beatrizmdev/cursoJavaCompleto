package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
				
		/*
		   função map != estrutura de dados Map
		   a função map é um função que aplica uma função a todos elementos de uma stream (uma sequência de dados)
		   não funcona para listas, é preciso converter uma lista pra stream e dps de dtream pra List novamente
		
		   List -> stream: .stream()
		   stream -> List: .ccollect(Collectors.toList())
		*/
		
		Function<Product, String> func = p -> p.getName().toUpperCase();
		
		List<String> name = list.stream().map(func).collect(Collectors.toList());
		/*
		 * list.stream() obtem uma stream a partir dessa lista
		 * list.stream().map(new UpperCaseName()) aplica a função UpperCaseName a todos os elementos de list.stream() devolvendo uma stream com os elementos transformados
		 * list.stream().map(new UpperCaseName()).collect(Collectors.toList()) converte essa nova stream pra lista novamente
		 */
		
		name.forEach(System.out::println);
	}

}
