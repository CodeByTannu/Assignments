package Assignments;

public class BankAccount 
{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the account details
    public BankAccount(int accountNumber, String accountHolderName, double balance) 
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to display account details
    public void displayDetails() 
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args)
    {
        // Create objects
        BankAccount account1 = new BankAccount(12345, "Tannu", 1000.0);
        BankAccount account2 = new BankAccount(67890, "annu", 500.0);

        // Display account details
        System.out.println("Account 1 :");
        account1.displayDetails();
        System.out.println();

        System.out.println("Account 2 :");
        account2.displayDetails();
        System.out.println();

        // Simulate transactions
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account2.deposit(1000.0);
        account2.withdraw(1500.0);
    }
}