package application;

import java.util.ArrayList;
import java.util.List;

public class CovarianciaProgram {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		list.add(20); // erro de compilacao
		
		// ele aceita a função list.get mas não aceita a função list.add (que é o put)
		// isso é a covariância do princípio get/put
		// surge em: List<? extends Algo> 
	}

}
