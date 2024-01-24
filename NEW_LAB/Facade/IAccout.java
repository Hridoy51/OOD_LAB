import java.math.BigDecimal;

public interface IAccout {

    void deposite(BigDecimal amount);
    void withdraw(BigDecimal amount);
    void transfer(IAccout to , BigDecimal amount);
    int getAccountNumber();
    BigDecimal getBalance();
}