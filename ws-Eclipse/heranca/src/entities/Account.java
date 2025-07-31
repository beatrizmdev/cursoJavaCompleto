package entities;

public class Account {

	private Integer Number;
	private String holder;
	protected Double balance; // um membro definido como protected pode ser acessado:
							  // - dentro da própria classe;
							  // - em uma classe diferente que esteja no mesmo pacote;
							  // - em um pacote diferente contanto que seja uma subclasse.
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		Number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return Number;
	}

	public void setNumber(Integer number) {
		Number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
		
}
