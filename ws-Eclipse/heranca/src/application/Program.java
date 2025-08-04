package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		/*
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
	
		// UPCASTING: casting de um objeto de subclasse para superclasse
		
		Account acc1 = bacc; // obj de subclasse está sendo atribuído à um objeto de superclasse
							 // isso é possível porque a HERANÇA é uma relação "é-um".
							 // Ou seja, uma BusinessAccount "é-um" Account.
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0); // Veja que não gera um erro
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01); // SavingAccount "é-um" Account
	
		// DOWNCASTING: casting de um objeto de superclasse para subclasse
		
		// BusinessAccount acc4 = acc2; // ERROR: não é possível converter de Account para BusinessAccount
		// Como a conversão é barrada, por segurança, é necessário forçar essa conversão manualmente
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3; // ERROR: SavingsAccount é uma Account mas não é uma BusinessAccount, então não é possível fazer o downcasting
		
		// Para testar se é possível realizar um downcasting, sem depender só do compilador
		if (acc3 instanceof BusinessAccount) { // "Se acc3 for instância de BusinessAccount [...]"
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
				
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		*/
	}
}
