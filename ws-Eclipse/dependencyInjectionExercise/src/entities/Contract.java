package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer contractNumber;
	private LocalDate contractDate;
	private Double contractTotalValue;
	
	private List<Installment> installments = new ArrayList<>();

	public Contract(Integer contractNumber, LocalDate contractDate, Double contractTotalValue) {
		this.contractNumber = contractNumber;
		this.contractDate = contractDate;
		this.contractTotalValue = contractTotalValue;
	}

	public Integer getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(Integer contractNumber) {
		this.contractNumber = contractNumber;
	}

	public LocalDate getContractDate() {
		return contractDate;
	}

	public void setContractDate(LocalDate contractDate) {
		this.contractDate = contractDate;
	}

	public Double getContractTotalValue() {
		return contractTotalValue;
	}

	public void setContractTotalValue(Double contractTotalValue) {
		this.contractTotalValue = contractTotalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
		
}
