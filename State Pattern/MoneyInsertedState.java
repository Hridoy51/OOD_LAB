public class MoneyInsertedState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public MoneyInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Item " + item + " already selected.");
    }

    @Override
    public void insertMoney(int amount) {
        vendingMachine.addMoney(amount);
        System.out.println("Money added: $" + amount);
    }

    @Override
    public void dispenseItem() {
        if (vendingMachine.getMoney() >= vendingMachine.getItemPrice()) {
            System.out.println("Item dispensed: " + vendingMachine.getSelectedItem());
            vendingMachine.subtractMoney(vendingMachine.getItemPrice());
            vendingMachine.reset();
            vendingMachine.changeState(vendingMachine.getSoldState());
        } else {
            System.out.println("Insufficient money. Please insert more.");
        }
    }

    @Override
    public void returnMoney() {
        System.out.println("Money returned.");
        vendingMachine.reset();
        vendingMachine.changeState(vendingMachine.getNoSelectionState());
    }
}
