import java.util.ArrayList;
import java.util.List;

public class OrderFulfillment implements Order {
    private List<Warehouse> warehouses = new ArrayList<>();

    public void addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
    }

    public void fulfillOrder() {
        // Implement order fulfillment logic here
        System.out.println("Fulfilling order using multiple warehouses:");
        for (Warehouse warehouse : warehouses) {
            warehouse.fulfillOrder();
        }
    }
}
