package loopForEach;

public class Main {

	public static void main(String[] args) {
		// o laço for each é uma sintaxe do loop For opcional e simplificada pra percorrer coleções
		
		/*
		 for (tipo apelido : coleção) {
		 	<comando 1>
		 	<comando 2>
		 }
		*/
		
		String[] vect = new String[] {"Maria", "Alex", "João"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("--------------------------------------");
		
		
		for (String obj : vect) {        // "para cada objeto 'obj' contido em vect, faça:"
			System.out.println(obj);
		}

	}

}
