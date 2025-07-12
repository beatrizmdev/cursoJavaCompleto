package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double[] height = new double[n];
		char[] gender = new char[n];		
		
		for (int i=0; i<n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			height[i] = sc.nextDouble();
			System.out.print("Gênero da " + (i+1) + "a pessoa: ");
			gender[i] = sc.next().charAt(0);
		}
		
		People people = new People(height, gender);
		
		System.out.printf("%nMenor altura: %.2f", people.lowest());
		System.out.printf("%nMaior altura: %.2f", people.higher());
		System.out.printf("%nMédia das alturas das mulheres: %.2f", people.avg());
		System.out.printf("%nNúmero de homens: %d", people.men());

		sc.close();
	}

}
