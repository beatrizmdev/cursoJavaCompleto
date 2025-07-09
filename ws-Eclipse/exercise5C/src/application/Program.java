package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] vectName = new String[n];
		int[] vectAge = new int[n];
		double[] vectHeight = new double[n];
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			vectName[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectAge[i] = sc.nextInt();
			System.out.print("Altura: ");
			vectHeight[i] = sc.nextDouble();
		}
		
		Pessoas pessoas = new Pessoas(vectName, vectAge, vectHeight);
		
		System.out.printf("%nAltura média: %.2f", pessoas.avgHeight());
		System.out.printf("%nPessoas com menos de 16 anos: %.1f%% %n", pessoas.under16());
		pessoas.namesUnder16();
		
		sc.close();
	}

}
