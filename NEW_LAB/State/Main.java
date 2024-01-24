

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(2);
        vm.insertDollar();
        vm.dispense();
        vm.dispense();
        vm.insertDollar();
        vm.ejectMoney();
        vm.ejectMoney();
        vm.insertDollar();
        
        vm.getState();
    }
}
