package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "mariga@gmail.com");
		Client c2 = new Client("Maria", "mariga@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); // compara os conteúdos dos eobjetos
		System.out.println(c1 == c2); // compara as referências de memória dos objetos

		String s1 = "Teste";
		String s2 = "Teste";
		
		System.out.println(s1 == s2); // dá verdadeiro nesse caso específico pois o compilador dá um tratamento especial quando a String é feita de maneira literal
	
		String s3 = new String("Teste");
		String s4 = new String("Teste");
		
		System.out.println(s3 == s4); // aqui dá falso, pois estamos forçando a instância de um OBJETO, da forma comum, então o compilador não trata de maneira especial
	}

}
