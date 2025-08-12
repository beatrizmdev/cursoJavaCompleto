package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("C:\\testeJava\\in.txt"); // pega esse arquivo presente nesse caminho
		Scanner sc = null;
		
		try {
			sc = new Scanner(file); // usa o scanner p ler o arquivo
			while (sc.hasNextLine()) { // percorre as linhas do arquivo
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException error) {
			System.out.println("Error opening file: " + error.getMessage());
		}
		finally { // esse bloco vai ser executado independente se o try der erro ou não
			if (sc != null) {
				sc.close(); // fechando o scanner e o arquivo
			}
			System.out.println("Finally block executed");
		}

	}

}
