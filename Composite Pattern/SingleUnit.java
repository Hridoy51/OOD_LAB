// Leaf class representing a single housing unit
class SingleUnit implements HousingStructure {
    private String name;

    public SingleUnit(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Single Unit: " + name);
    }
}
