package SimpleBankingSystem;

import java.util.HashMap;
import java.util.Map;

public class BankingSystem {
	private Map<Integer, Account> accounts;
	private int nextAccountNumber;

	public BankingSystem() {
		accounts = new HashMap<>();
		nextAccountNumber = 1;
	}

	public int createAccount(String accountHolderName, double initialBalance) {
		Account account = new Account(nextAccountNumber, accountHolderName, initialBalance);
		accounts.put(nextAccountNumber, account);
		return nextAccountNumber++;
	}

	public boolean deposit(int accountNumber, double amount) {
		Account account = accounts.get(accountNumber);
		if (account != null) {
			account.deposit(amount);
			return true;
		}
		return false;
	}


	public boolean withdraw(int accountNumber, double amount) {
		Account account = accounts.get(accountNumber);
		if (account != null) {
			return account.withdraw(amount);
		}
		return false;
	}
	
	public double getBalance(int accountNumber) {
		Account account = accounts.get(accountNumber);
		if (account != null) {
			return account.getBalance();
		}
		return -1;
	}
}