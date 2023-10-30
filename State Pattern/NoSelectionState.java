public class NoSelectionState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public NoSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Selected " + item);
        vendingMachine.setSelectedItem(item);
        vendingMachine.changeState(vendingMachine.getHasSelectionState());
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Please select an item first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("No item selected.");
    }

    @Override
    public void returnMoney() {
        System.out.println("No money to return.");
    }
}
