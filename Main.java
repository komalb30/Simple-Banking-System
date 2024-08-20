package SimpleBankingSystem;

import java.util.Scanner;

public class Main {
	private static BankingSystem bankingSystem;
	private static Scanner scanner;

	public static void main(String[] args) {
		bankingSystem = new BankingSystem();
		scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Simple Banking System");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Check Balance");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				createAccount();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				checkBalance();
				break;
			case 5:
				System.out.println("Exiting...");
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void createAccount() {
		System.out.print("Enter account holder's name: ");
		String accountHolderName = scanner.next();
		System.out.print("Enter initial balance: ");
		double initialBalance = scanner.nextDouble();

		int accountNumber = bankingSystem.createAccount(accountHolderName, initialBalance);
		System.out.println("Account created successfully. Your account number is " + accountNumber);
	}

	private static void deposit() {
		System.out.print("Enter account number: ");
		int accountNumber = scanner.nextInt();
		System.out.print("Enter amount to deposit: ");
		double amount = scanner.nextDouble();

		if (bankingSystem.deposit(accountNumber, amount)) {
			System.out.println("Deposit successful.");
		} else {
			System.out.println("Account does not exist.");
		}
	}

	private static void withdraw() {
		System.out.print("Enter account number: ");
		int accountNumber = scanner.nextInt();
		System.out.print("Enter amount to withdraw: ");
		double amount = scanner.nextDouble();

		if (bankingSystem.withdraw(accountNumber, amount)) {
			System.out.println("Withdrawal successful.");
		} else {
			System.out.println("Account does not exist or insufficient balance.");
		}
	}

	private static void checkBalance() {
		System.out.print("Enter account number: ");
		int accountNumber = scanner.nextInt();

		double balance = bankingSystem.getBalance(accountNumber);
		if (balance != -1) {
			System.out.println("Your balance is " + balance);
		} else {
			System.out.println("Account does not exist.");
		}
	}
}
