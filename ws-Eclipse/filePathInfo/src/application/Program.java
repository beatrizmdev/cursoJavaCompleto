package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Pegue o nome do arquivo/pasta desprezando o caminho:
		System.out.println("getName: " + path.getName());
		
		// Pegue só o camminho, desprezando o nome:
		System.out.println("getParent: " + path.getParent());
		
		// Pegue o camminho completo, incluindo o nome:
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
	}

}
