package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		/*
		 File Writer é uma stream básica de escrita de caracteres em arquivos
		 2 formas de instanciar o FileWriter:
			 new FileWriter(path) : cria/recria o arquivo
			 new FileWriter(path,true) : acrescenta ao arquivo existente
			 
		Buffered Writer é a mesma coisa do buffered reader, é mais rápico, faz casting
		*/
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good nigth"};
		
		String path = "C:\\Users\\abbm9\\OneDrive\\Documentos\\temp\\out.txt";
		
		// try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { sem o parâmetro "true", ele vai recriar o arquivo todas as vezes que vc rodar o código
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // com o parâmetro ele reescreve acrescentando ao mesmo arquivo 
		for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException error) {
			error.printStackTrace();
		}
	}

}
