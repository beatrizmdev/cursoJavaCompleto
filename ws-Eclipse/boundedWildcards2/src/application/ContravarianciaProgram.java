package application;

import java.util.ArrayList;
import java.util.List;

public class ContravarianciaProgram {

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		Number x = myNums.get(0); // erro de compilacao
		
		// aqui, o compliador aceita o list.add mas não aceita o list.get, isso pq ele não consegue atribuir
		// o valor à variável X que é do tipo Number, já que esse valor pode ser do tipo Number ou Objects
		
		// isso é a contravariância do princípio get/put
		// surge em: List<? super Algo> 
	}

}
