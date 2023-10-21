public class ProxyPatternDemo {
    public static void main(String[] args) {
        // Create warehouses
        Warehouse warehouse1 = new Warehouse("Warehouse 1");
        Warehouse warehouse2 = new Warehouse("Warehouse 2");
        //initial status of the warehouses
        System.out.println("Initial Status: ");
        System.out.println("Warehouse 1: ");
        System.out.print("      Product A: ");
        System.out.println(warehouse1.currentInventory("Product A"));
        System.out.print("      Product B: ");
        System.out.println(warehouse1.currentInventory("Product B"));
        System.out.println("Warehouse 2: ");
        System.out.print("      Product A: ");
        System.out.println(warehouse2.currentInventory("Product A"));
        System.out.print("      Product B: ");
        System.out.println(warehouse2.currentInventory("Product B"));
        // Add products to inventory
        warehouse1.addToInventory("Product A", 100);
        warehouse2.addToInventory("Product B", 50);
        //After adding product
        System.out.println("After adding Products : ");
        System.out.println("Warehouse 1: ");
        System.out.print("      Product A: ");
        System.out.println(warehouse1.currentInventory("Product A"));
        System.out.print("      Product B: ");
        System.out.println(warehouse1.currentInventory("Product B"));
        System.out.println("Warehouse 2: ");
        System.out.print("      Product A: ");
        System.out.println(warehouse2.currentInventory("Product A"));
        System.out.print("      Product B: ");
        System.out.println(warehouse2.currentInventory("Product B"));
        // Create order fulfillment service
        OrderFulfillment orderFulfillment = new OrderFulfillment();

        // Add warehouses to the order fulfillment service
        orderFulfillment.addWarehouse(warehouse1);
        orderFulfillment.addWarehouse(warehouse2);

        // Fulfill an order
        orderFulfillment.fulfillOrder();
        //assume one order it sells 5 unit..
        warehouse1.removeFromWarehouse("Product A", 5);
        warehouse2.removeFromWarehouse("Product B", 5);
        //after order fulfilling
        System.out.println("After order Fulfilling : ");
        System.out.println("Warehouse 1: ");
        System.out.print("      Product A: ");
        System.out.println(warehouse1.currentInventory("Product A"));
        System.out.print("      Product B: ");
        System.out.println(warehouse1.currentInventory("Product B"));
        System.out.println("Warehouse 2: ");
        System.out.print("      Product A: ");
        System.out.println(warehouse2.currentInventory("Product A"));
        System.out.print("      Product B: ");
        System.out.println(warehouse2.currentInventory("Product B"));
    }
}
