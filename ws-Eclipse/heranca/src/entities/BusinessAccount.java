package entities;

public class BusinessAccount extends Account{ 
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super(); // a super classe é a classe Account
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}

	@Override
	public void withdraw(double amount) { // reaproveitando o método mas só adicionando coisa nele
		super.withdraw(amount); // o super é responsável por nos permitir reutilizar a lógica do método anterior
		balance -= 2.0;
	}	
}
