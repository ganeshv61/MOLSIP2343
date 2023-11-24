import java.util.Scanner;

class Account 
{
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) 
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) 
    {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } 
        else 
        {
            System.out.println("Invalid amount for deposit");
        }
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } 
        else 
        {
            System.out.println("Insufficient funds or invalid amount for withdrawal");
        }
    }

    public double getBalance() 
    {
        return balance;
    }
}

public class ATM 
{
    public static void main(String[] args) 
    {
        Account account = new Account("123456789", 1000.0);
        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;

        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter amount to deposit: $");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 3:
                    System.out.println("Your balance is: $" + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } 
            while (choice != 4);

        scanner.close();
    }
}
