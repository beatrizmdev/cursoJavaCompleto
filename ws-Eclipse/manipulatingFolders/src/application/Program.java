package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);

		// como criar uma subpasta a partir da pasta em path
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
		
		// como listar todas as pastas presentes naquele caminho Path
		
		File[] folders = path.listFiles(File::isDirectory); // "File::isDirectory" é uma função que filtra os arquivos selecionando somente as pastas
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
				
		// como listar todas os arquivos presentes naquele caminho Path
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for(File file : files) {
			System.out.println(file);
		}
		
	}

}
