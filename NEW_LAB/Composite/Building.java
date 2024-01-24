import java.util.ArrayList;
import java.util.List;

public class Building implements HousingStructure{
    String name;
    List<HousingStructure>building;
    public Building(String name){
        this.name = name; 
        this.building = new ArrayList<HousingStructure>();
    }
    public void addConponent(HousingStructure structure){
        building.add(structure);
    }
    @Override
    public void display() {
        System.out.print(name);
        System.out.println(" includes: ");
        for(HousingStructure structure:building){
            structure.display();
        }
    }
    
}
