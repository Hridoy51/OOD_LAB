

public class IdleState implements State{

    @Override
    public void insertDollar(VendingMachine vendingmachine) {
        System.out.println("One dollar has been inserted successfully");
        vendingmachine.setState(vendingmachine.getHasOneDollarState()); 
    }

    @Override
    public void ejectMoney(VendingMachine vendingmachine) {
        System.out.println("No money to Eject as idle state");
    }

    @Override
    public void dispense(VendingMachine vendingmachine) {
        System.out.println("Payment required");
    }
    
}
