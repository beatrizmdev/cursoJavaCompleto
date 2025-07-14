package boxingAndUnboxing;

public class Main {

	public static void main(String[] args) {
		
		int x = 20;
		
		// Boxing: é converter um objeto de tipo valor para um objeto do tipo referência
		Object obj = x;
		System.out.println("obj: " + obj);
		
		// Unboxing: é converter um objeto do tipo referência para um de tipo valor compatível
		int y = (int) obj; // aqui o Casting se faz necessário para se tornar compatível. Object != int.
		System.out.println("y: " + y);
	}

}
