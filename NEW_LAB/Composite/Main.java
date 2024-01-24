

public class Main {
    public static void main(String[] args) {
        HousingStructure h1 = new House("house1");
        House h2 = new House("house2");
        Appartment a1 = new Appartment("Appartment1");
        Appartment a2 = new Appartment("Appartment2");
        Building sb = new Building("Subbuilding1");
        Building mb = new Building("Main Buliding");
        sb.addConponent(h2);
        sb.addConponent(a2);
        mb.addConponent(h1);
        mb.addConponent(a1);
        mb.addConponent(sb);
        mb.display();
    }
    

}
