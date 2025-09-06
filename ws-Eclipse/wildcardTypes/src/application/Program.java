package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
	// Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo", como o que fizemos anteriormente usando Object
	// Nas listas, o Object não funciona da mesma maneira, pra isso, usamos o List<?>	
	
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
	
	// Porém, como a lista List<?> é de qualquer tipo, você não consegue adicionar nenhum valor à ela pois o compilador não sabe se o valor
	// é compatível com o dessa lista.
}