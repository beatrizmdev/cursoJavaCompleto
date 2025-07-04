package entities;

public class Register {
	private final int accountNumber;
	private String holder;
	private double balance;
	
	public Register(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public Register(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}	
	
	public void withdraw(double amount) {
		balance -= (amount + 5.0);
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", holder: "
				+ holder
				+ ", balance: $ " 
				+ String.format("%.2f", balance);
	}
	
}
