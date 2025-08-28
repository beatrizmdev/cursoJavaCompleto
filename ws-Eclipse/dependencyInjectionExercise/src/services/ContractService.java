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
		
		double basicInstValue = contract.getContractTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getContractDate().plusMonths(i);
			double interest = onlinePayment.interest(basicInstValue, i); // interest = juros
			double fee = onlinePayment.paymentFee(basicInstValue + interest);
			double instValue = basicInstValue + interest + fee;// fee = taxa (taxa de serviço)
		
			contract.getInstallments().add(new Installment(dueDate, instValue));
		}
		
	}
	
}
