public class SoldState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Item " + item + " already selected.");
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Item already dispensed. Cannot insert money.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item already dispensed. Cannot dispense again.");
    }

    @Override
    public void returnMoney() {
        System.out.println("Item already dispensed. Cannot return money.");
    }
}
