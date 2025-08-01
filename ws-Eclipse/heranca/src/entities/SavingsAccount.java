package entities;

public class SavingsAccount extends Account{

// a palavra "final" em classes, evita que essa classe seja herdada por outra (proíbe que tenha subclasses)
// public final class SavingsAccount extends Account{

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate; 		
	}
	
	@Override
	public final void withdraw(double amount) { // reaproveitando o método mas retirando coisa dele / mudando ele
		balance -= amount;
	}	
}
