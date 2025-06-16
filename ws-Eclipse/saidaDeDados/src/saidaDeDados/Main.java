package saidaDeDados;

import java.util.Locale; // pra mudar a localização padrão e os números flutuantes imprimirem com . e não com ,

public class Main {
	public static void main(String[] args) {
		
		// Saída de dados com quebra de linha no fim
		System.out.println("Oie");
		System.out.println("Olá");

		// Saída de dados sem quebra de linha no fim
		System.out.print("Oie");
		System.out.print("Olá");
		
		// para formatar números doubles
		double num = 12.789456;
		
		System.out.println(num); // não formatado
		System.out.printf("%.2f%n", num); // formatado (%n é só a quebra de linha)
	
		// mudando a forma de saída de números double (, -> .)
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", num); // formatado (%n é só a quebra de linha)

		// Saída formatada com concatenação
		System.out.printf("Resultado = %.2f cm%n", num);
		
		// Com vários elementos
		String nome = "Ana";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
	}

}
