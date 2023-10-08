// BankingFacade.java (Facade)
public class BankingFacade {
    private Account savingsAccount;
    private Account checkingAccount;
    private Account investmentAccount;

    public BankingFacade() {
        savingsAccount = new SavingsAccount(1000.0);
        checkingAccount = new CheckingAccount(2000.0);
        investmentAccount = new InvestmentAccount(5000.0);
    }

    public void depositToSavings(double amount) {
        savingsAccount.deposit(amount);
    }

    public void withdrawFromSavings(double amount) {
        savingsAccount.withdraw(amount);
    }

    public void depositToChecking(double amount) {
        checkingAccount.deposit(amount);
    }

    public void withdrawFromChecking(double amount) {
        checkingAccount.withdraw(amount);
    }

    public void depositToInvestment(double amount) {
        investmentAccount.deposit(amount);
    }

    public void withdrawFromInvestment(double amount) {
        investmentAccount.withdraw(amount);
    }

    public double getSavingsBalance() {
        return savingsAccount.getBalance();
    }

    public double getCheckingBalance() {
        return checkingAccount.getBalance();
    }

    public double getInvestmentBalance() {
        return investmentAccount.getBalance();
    }
}
