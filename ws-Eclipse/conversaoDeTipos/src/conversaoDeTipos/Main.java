package conversaoDeTipos;

public class Main {
	public static void main(String[] args) {

		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = a / b; // ele vai entender que vc quer um resultado em int e arredondar
		System.out.println(resultado);
		
		resultado = (double) a / b; // casting, conversão explícita		
		System.out.println(resultado);	
		
		// outro caso: a linguagem te impede de fazer algo pois sabe que vc vai perder informação com isso
		double num1 = 5.5;
		int num2;
		
		// num2 = num1; // dá erro e o programa é impedido de executar
		num2 = (int) num1;
		System.out.println(num2);
		
	}
}
