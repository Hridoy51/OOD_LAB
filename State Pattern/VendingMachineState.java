// Define the VendingMachineState interface
public interface VendingMachineState {
    void selectItem(String item);
    void insertMoney(int amount);
    void dispenseItem();
    void returnMoney();
}

