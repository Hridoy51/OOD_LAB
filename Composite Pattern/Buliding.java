// Composite class representing a building composed of multiple housing units
import java.util.ArrayList;
import java.util.List;

class Building implements HousingStructure {
    private String name;
    private List<HousingStructure> units = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }

    public void addUnit(HousingStructure unit) {
        units.add(unit);
    }

    @Override
    public void display() {
        System.out.println("Building: " + name);
        System.out.println("Units within " + name + ":");
        for (HousingStructure unit : units) {
            unit.display();
        }
    }
}
