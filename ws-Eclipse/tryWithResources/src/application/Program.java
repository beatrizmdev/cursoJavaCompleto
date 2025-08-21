package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		// o bloco try-with-resources é um bloco try que declara um ou mais recursos,
		// e garante que esses recursos serão fechados ao final do bloco
		
		String path = "C:\\Users\\abbm9\\OneDrive\\Documentos\\temp\\in.txt";
		
		// implementação básica padrão super manual

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException error) {
			System.out.println("Error: " + error.getMessage());
		}

		
	}

}