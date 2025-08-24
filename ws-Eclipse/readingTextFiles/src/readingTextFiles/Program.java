package readingTextFiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\abbm9\\OneDrive\\Documentos\\temp");
		Scanner sc = null;
		
		try { // o programa vai tentar abrir o arquivo e isso pode gerar um erro: IO Exception
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException error) {
			System.out.println("Error: " + error.getMessage());
		}
		finally { // o scanner vai ser fechado independente se deu certo ou não
			if (sc != null) { // s ó fecha se não tiver dado erro lá no início, na instanciação do arquivo
				sc.close();
			}
		}
	}

}
