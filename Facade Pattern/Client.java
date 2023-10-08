public class Client {
    public static void main(String[] args) {
        BankingFacade bankingFacade = new BankingFacade();

        // Deposit to savings
        bankingFacade.depositToSavings(500.0);

        // Withdraw from checking
        bankingFacade.withdrawFromChecking(300.0);

        // Deposit to investment
        bankingFacade.depositToInvestment(1000.0);

        // Check balances
        System.out.println("Savings Balance: " + bankingFacade.getSavingsBalance());
        System.out.println("Checking Balance: " + bankingFacade.getCheckingBalance());
        System.out.println("Investment Balance: " + bankingFacade.getInvestmentBalance());
    }
}
// i can make this real time system but i think it's only for understanding the facade pattern.

