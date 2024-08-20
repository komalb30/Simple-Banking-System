package SimpleBankingSystem;

public class Account {

	 private int accountNumber;
	 private String accountHolderName;
	 private double balance;
	 
	 public Account(int accountNumber, String accountHolderName, double initialBalance) {
	     this.accountNumber = accountNumber;
	     this.accountHolderName = accountHolderName;
	     this.balance = initialBalance;
	 }
	 
	 public int getAccountNumber() {
	     return accountNumber;
	 }
	 
	 public String getAccountHolderName() {
	     return accountHolderName;
	 }
	 
	 public double getBalance() {
	     return balance;
	 }
	 
	 public void deposit(double amount) {
	     balance += amount;
	 }
	 
	 public boolean withdraw(double amount) {
	     if (balance >= amount) {
	         balance -= amount;
	         return true;
	     }
	     return false;
	 }
}
