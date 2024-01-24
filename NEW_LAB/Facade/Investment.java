import java.math.BigDecimal;

public class Investment implements IAccout{
    int accountNumber;
    int initialAccount = 100;
    BigDecimal balance;
    public Investment(BigDecimal initialAmount){
        this.balance = initialAmount;
        this.accountNumber = initialAccount+1;
    }

    public void withdraw(BigDecimal amount){
        if(balance.compareTo(amount)>=0){
            balance = balance.subtract((amount));
        }
        else {
            System.out.println("Insufficient balance");
        }
            
    }
    public void deposite(BigDecimal amount){
        balance = balance.add(amount);
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public BigDecimal getBalance(){
        return balance;
    }
    public void transfer(IAccout toaccout, BigDecimal amount){
        if(toaccout!=null && toaccout != this){
            if(balance.compareTo(amount)>0){
                withdraw(amount);
                toaccout.deposite(amount);
                System.out.println("Transfer successfully");
            }
            
        }
        else{
            System.out.println("Ivalid acount");
        }
    }
}
