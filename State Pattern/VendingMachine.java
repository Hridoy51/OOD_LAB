public class VendingMachine {
    private VendingMachineState noSelectionState;
    private VendingMachineState hasSelectionState;
    private VendingMachineState moneyInsertedState;
    private VendingMachineState soldState;
    private VendingMachineState currentState;

    private String selectedItem;
    private int money;
    private int itemPrice;

    public VendingMachine(int itemPrice) {
        noSelectionState = new NoSelectionState(this);
        hasSelectionState = new HasSelectionState(this);
        moneyInsertedState = new MoneyInsertedState(this);
        soldState = new SoldState(this);
        currentState = noSelectionState;

        this.itemPrice = itemPrice;
    }

    public void changeState(VendingMachineState state) {
        currentState = state;
    }

    public void selectItem(String item) {
        currentState.selectItem(item);
    }

    public void insertMoney(int amount) {
        currentState.insertMoney(amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public void returnMoney() {
        currentState.returnMoney();
    }

    public VendingMachineState getNoSelectionState() {
        return noSelectionState;
    }

    public VendingMachineState getHasSelectionState() {
        return hasSelectionState;
    }

    public VendingMachineState getMoneyInsertedState() {
        return moneyInsertedState;
    }

    public VendingMachineState getSoldState() {
        return soldState;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int amount) {
        money += amount;
    }

    public void subtractMoney(int amount) {
        money -= amount;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void reset() {
        selectedItem = null;
        money = 0;
    }

    public void dispenseProduct() {
        System.out.println("Product dispensed.");
    }

    public void releaseProduct() {
        if (getCount() > 1) {
            doReleaseProduct();
            changeState(getNoSelectionState());
        } else {
            doReleaseProduct();
            changeState(getOutOfStockState());
        }
    }

    private VendingMachineState getOutOfStockState() {
        return null;
    }

    public int getCount() {
        // dummy
        return 0;
    }

    public void doReleaseProduct() {
        // dummy
    }

    public void doReturnMoney() {
        // dummy
    }
}
