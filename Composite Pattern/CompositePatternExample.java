import java.util.ArrayList;
import java.util.List;
public class CompositePatternExample {
    public static void main(String[] args) {
        // Create leaf housing units
        HousingStructure unit1 = new SingleUnit("Apartment 101");
        HousingStructure unit2 = new SingleUnit("Apartment 102");
        HousingStructure unit3 = new SingleUnit("House A");
        HousingStructure unit4 = new SingleUnit("House B");

        // Create a composite building
        Building building = new Building("My Residence");

        // Add leaf units to the composite building
        building.addUnit(unit1);
        building.addUnit(unit2);

        Building complex = new Building("My Housing Complex");
        complex.addUnit(unit3);
        complex.addUnit(unit4);

        building.addUnit(complex);

        // Display the composite structure
        building.display();
    }
}
