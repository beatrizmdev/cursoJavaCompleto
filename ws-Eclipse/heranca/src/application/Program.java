package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
	
		// UPCASTING: casting de uma subclasse para superclasse
		
		Account acc1 = bacc; // obj de subclasse está sendo atribuído à um objeto de superclasse
							 // isso é possível porque a HERANÇA é uma relação "é-um".
							 // Ou seja, uma BusinessAccount "é-um" Account.
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0); // Veja que não gera um erro
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01); // SavingAccount "é-um" Account
	}
}
