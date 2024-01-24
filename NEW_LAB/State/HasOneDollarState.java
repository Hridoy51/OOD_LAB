

public class HasOneDollarState implements State{

    @Override
    public void insertDollar(VendingMachine vendingmachine) {
        System.out.println("Already has one dollar");
    }

    @Override
    public void ejectMoney(VendingMachine vendingmachine) {
        vendingmachine.doReturnMoney();
        vendingmachine.setState(vendingmachine.getIdleState());
    }

    @Override
    public void dispense(VendingMachine vendingmachine) {
        int count = vendingmachine.getCount();
        if(count>1){
            vendingmachine.doReleaseProduct();
            vendingmachine.setState(vendingmachine.getIdleState());
        }
        else{
            vendingmachine.doReleaseProduct();
            vendingmachine.setState(vendingmachine.getOutOfStockState());
        }
        

    }
    
}
