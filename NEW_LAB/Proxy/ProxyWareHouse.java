import java.util.Map;

public class ProxyWareHouse implements RetailerShop{
    RealWareHouse realWareHouse;
    public ProxyWareHouse(){
        realWareHouse = null;
    }
    @Override
    public Map<String, Integer> getInventory() {
        if(realWareHouse == null){
            realWareHouse = new RealWareHouse();
        }
    
        return realWareHouse.getInventory();
        
        
        
    }
}
