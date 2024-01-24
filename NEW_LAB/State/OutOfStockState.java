

public class OutOfStockState implements State{

    @Override
    public void insertDollar(VendingMachine vendingmachine) {
        System.out.println("Sorry, Out of Stock");
    }

    @Override
    public void ejectMoney(VendingMachine vendingmachine) {
        vendingmachine.doReturnMoney();
    }

    @Override
    public void dispense(VendingMachine vendingmachine) {
        System.out.println("Out of Stock");
    }
    
}
