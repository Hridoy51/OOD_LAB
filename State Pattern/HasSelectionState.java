public class HasSelectionState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public HasSelectionState(VendingMachine vendingMachine) {
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
        vendingMachine.changeState(vendingMachine.getMoneyInsertedState());
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please insert money first.");
    }

    @Override
    public void returnMoney() {
        System.out.println("Money returned.");
        vendingMachine.reset();
        vendingMachine.changeState(vendingMachine.getNoSelectionState());
    }
}
