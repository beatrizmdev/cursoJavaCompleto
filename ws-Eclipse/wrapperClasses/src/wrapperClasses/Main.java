package wrapperClasses;

public class Main {

	public static void main(String[] args) {
		
		// Por que usar?
		// Classes wrapper são equivalentes aos tipos primitivos
		// mas aceitam valores null e usufruem dos recursos da orientação a objeto (melhor)
		
		int x = 20;
		
		// Boxing em um objeto de tipo referência que é uma classe wrapper
		Integer obj = x;
		System.out.println("obj: " + obj);
		
		// Unboxing. Aqui o Casting já não se faz necessário para se tornar compatível, pois Integer é compatível com Int.
		int y = obj;
		int z = obj * 2;// 
		System.out.println("y: " + y);
		System.out.println("z: " + z);

	}

}
