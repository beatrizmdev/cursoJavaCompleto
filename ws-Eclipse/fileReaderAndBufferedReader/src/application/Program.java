package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		// FileReader (stream/sequência de leitura de caracteres a partir de arquivos)
		// BufferedReader (é instanciado a partir do FileReader mas implementa algumas otimizações, se tornando mais rápido usando buffer de memória)
		
		String path = "C:\\Users\\abbm9\\OneDrive\\Documentos\\temp\\in.txt";
		
		// implementação básica padrão super manual
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path); //aqui estamos estabelecendo uma streaming (uma seq de leitura) a partir do arquivo que está no caminho path
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException error) {
			System.out.println("Error: " + error.getMessage());
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException error) {
				error.printStackTrace(); // mostra detalhadamente o erro
			}
		}
		
	}

}
