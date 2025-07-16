package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Matrix dimension: ");
		int dim = sc.nextInt();
		int[][] matrix = new int[dim][dim];
		
		System.out.println("insert the matrix:");
		for (int i=0; i<dim; i++) {
			for (int j=0; j<dim; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for(int i=0; i<dim; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		
		int sum = 0;
		for (int i=0; i<dim; i++) {
			for (int j=0; j<dim; j++) {
				if (matrix[i][j] < 0) {
					sum++;
				}
			}
		}
		System.out.println();
		System.out.print("Negative numbers = " + sum);
		
		sc.close();
	}

}
