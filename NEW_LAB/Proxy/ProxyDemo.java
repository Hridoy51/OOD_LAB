import java.util.Map;

public class ProxyDemo {
    public static void main(String[] args) {
        ProxyWareHouse wareHouse = new ProxyWareHouse();
        Map<String,Integer> h1 = wareHouse.getInventory();
        System.out.println(h1);
    }
}
