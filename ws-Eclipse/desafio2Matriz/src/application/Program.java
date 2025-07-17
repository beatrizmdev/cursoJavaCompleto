package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Line and columns: ");
		int l = sc.nextInt();
		int c = sc.nextInt();
		int[][] matrix = new int[l][c];
		
		for (int i=0; i<l; i++) {
			for (int j=0; j<c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Number to be read: ");
		int num = sc.nextInt();
		
		for (int i=0; i<l; i++) {
			for (int j=0; j<c; j++) {
				
				if (matrix[i][j] == num) {
					System.out.println("Position " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j-1]);
					}
					if (j < matrix[i].length-1) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
					if (i < matrix.length) {
						System.out.println("Down: " + matrix[i+1][j]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
				}
				
			}
		} 
		
		sc.close();
	}

}
