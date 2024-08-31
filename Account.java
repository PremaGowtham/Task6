package task6;

public class Account {
	
	 // Data members for the account
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // No-argument constructor
    public Account() {
        this.accountNumber = "Unknown";
        this.accountHolderName = "Unknown";
        this.balance = 0.0;
    }

    // Constructor with two arguments (account number and account holder name)
    public Account(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check the current balance
    public double checkBalance() {
        return balance;
    }

    // Getter methods for account details
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

}
