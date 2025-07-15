package aprendendoSobreLista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		/*
		 Definindo: List<tipoEmWrapperClass> nome; 
		 obs: as listas não aceitam os tipos primitivos (int, double, etc...)
		*/
		List<String> list;
		
		/* 
		 Instanciando: 		
		 Não aceita "List<String> list = new List<>();", pois a Lista é um obj do tipo Interface
		 Para instanciar um tipo Interface, é preciso usar uma classe que "implementa" a classe Interface, como a ArrayList
		*/ 
		list = new ArrayList<>();
		
		/*
		 Para adicionar um item: nome.add(itemAAdicionar);
		*/
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		// Inserindo um novo item numa posição específica:
		list.add(2, "Marco");
		
		// Imprimindo com for each pra testar:
		for (String x : list) {
			System.out.println(x);
		}
		
		// Ver o tamanho da lista:
		System.out.println(list.size());
		
		System.out.println("-----------------------------");
		
		// Remover item da lista 
		list.remove("Ana");
		list.remove(1);
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		
		// Remover por um predicado (todas que começam com M)
		list.removeIf(x -> x.charAt(0) == 'M'); // essa é uma expressão lambda
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		
		// Encontrar index de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("-----------------------------");
		
		// Se eu quisesse deixar na lista só quem começa com a letra M:
		list.add("Maria");
		list.add("Marco");
		list.add("Alex");
		list.add("Anna");
			// o tipo stream está disponível do java 8 em diante e aceita operações com as expressões lambda
			// o tipo stream não é compatível com o list, então temos que converter ele de volta pra lista com a função collect 
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); 
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		
		// Como encontrar um primeiro elemento que comece com um predicado específico
			// a função findDirst também só está disponível a partir do JAVA 8
			// essa função retorna um tipo optional string, também do JAVA 8
			// a função orElse(null) diz que se ele não encontrar uma String que comece com 'A', ele deve retornar um valor null
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}
