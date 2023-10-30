public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(50);

        vendingMachine.selectItem("Chips");
        vendingMachine.insertMoney(30);
        vendingMachine.dispenseItem();
        vendingMachine.returnMoney();

        vendingMachine.selectItem("Soda");
        vendingMachine.insertMoney(20);
        vendingMachine.dispenseItem();
        vendingMachine.returnMoney();
        
        vendingMachine.selectItem("Candy");
        vendingMachine.insertMoney(100);
        vendingMachine.dispenseItem();
    }
}
