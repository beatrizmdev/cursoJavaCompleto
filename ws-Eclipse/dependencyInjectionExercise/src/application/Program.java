package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		
		System.out.print("Número: ");
		int contractNumber = sc.nextInt(); 
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double contractTotalValue = sc.nextDouble();
		
		Contract contract = new Contract(contractNumber, contractDate, contractTotalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int instNum = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, instNum);
		
		System.out.println("\nParcelas:");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}
