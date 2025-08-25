package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();		
		
		// C:\\Users\\abbm9\\OneDrive\\Documentos\\temp\\fileExercise
		System.out.println("Enter a file path: ");
		String srcFileStr = sc.nextLine();
		
		File srcFile = new File(srcFileStr);
		String srcFolderStr = srcFile.getParent();
		
		System.out.println("Testing...");
		
		Boolean success = new File(srcFolderStr + "\\out").mkdir();
		
		String targetFileStr = srcFolderStr + "\\out\\summary.csv";
		
		// aqui ele vai tentar ler o srcFileStr
		try (BufferedReader br = new BufferedReader(new FileReader(srcFileStr))) {
			String itemCsv = br.readLine();
			while (itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quant = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quant));
				
				itemCsv = br.readLine(); // passa p próxima linha
				
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {		
				for (Product item : list) {
					bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
					bw.newLine();
					
					System.out.println(targetFileStr + " created.");
					
				}
			}
			catch (IOException error) {
				System.out.println("Error writing file: " + error.getMessage());
			}
			
		}
		catch (IOException error) {
			System.out.println("Error writing file: " + error.getMessage());
		}
		
		sc.close();

	}

}
