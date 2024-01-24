import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        Integer account1 = bankService.createAccount("investment", new BigDecimal(2000));
        System.out.println(bankService.getAccountBalance(account1));
    }
}
