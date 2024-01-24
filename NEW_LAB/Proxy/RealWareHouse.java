import java.util.Hashtable;
import java.util.Map;

public class RealWareHouse implements RetailerShop{
    private Map<String,Integer>inventory;
    public RealWareHouse(){
        this.inventory = new Hashtable<String,Integer>();
        inventory.put("A", 10); 
        inventory.put("b", 20);
        inventory.put("c", 30);  
        
    }
   
    public Map<String, Integer> getInventory() {
        return inventory;
    }
}
