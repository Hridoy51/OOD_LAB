import java.util.Hashtable;

public class Warehouse implements Order {
    private Hashtable<String, Integer> stock;
    private String address;

    public Warehouse(String address) {
        this.address = address;
        stock = new Hashtable<>();
    }

    public void addToInventory(String product, int quantity) {
        stock.put(product, quantity);
    }
    public void removeFromWarehouse(String product,int quantity){
        int val = stock.get(product);
        stock.put(product,val-quantity);
        
    }
    public int currentInventory(String product) {
        return stock.getOrDefault(product, 0);
    }

    public void fulfillOrder() {
        // Implement order fulfillment logic here
        System.out.println("Fulfilling order from Warehouse at " + address+" ,at unit 5");
    }
}
