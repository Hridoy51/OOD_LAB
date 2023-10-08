public class Account {
    private String accountNumber;
    private double balance;

    //constructor
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    //to get the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    //to get the balance
    public double getBalance() {
        return balance;
    }

    //to deposit in the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }

    //to withdraw 
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }
}
