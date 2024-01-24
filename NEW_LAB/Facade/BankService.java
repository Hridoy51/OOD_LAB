import java.math.BigDecimal;
import java.util.Hashtable;
public class BankService {
    private Hashtable<Integer, IAccout>Accounts;
    public BankService(){
        this.Accounts = new Hashtable<Integer,IAccout>();
    }
    int createAccount(String type,BigDecimal initialAmount){
        IAccout accout = null;
        if(type.compareTo("investment")==0){
            accout = new Investment(initialAmount);
        }
        Accounts.put(accout.getAccountNumber(),accout);
        return accout.getAccountNumber();
    }
    void transferMoney(int from ,int to, BigDecimal amount){
        IAccout ac1 = Accounts.get(to);
        IAccout ac2 = Accounts.get(from);
        ac2.transfer(ac1,amount);
        
    }
    BigDecimal getAccountBalance(int accountNumber){
        IAccout a1 = Accounts.get(accountNumber);
        if(a1!=null){
            return a1.getBalance();
        }
        return new BigDecimal(0);
    }
}
