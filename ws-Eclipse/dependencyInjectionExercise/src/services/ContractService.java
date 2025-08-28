package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePayment onlinePayment;

	public ContractService(OnlinePayment onlinePayment) {
		this.onlinePayment = onlinePayment;
	}
	
	public void processContract(Contract contract, Integer months) {
		
		contract.getInstallments().add(new Installment(LocalDate.of(2025, 8, 27), 206.04));
		contract.getInstallments().add(new Installment(LocalDate.of(2025, 9, 27), 208.08));

	}
	
}
