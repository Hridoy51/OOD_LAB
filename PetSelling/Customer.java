public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void buyPet(Pet pet) {
        System.out.println(name + " has bought a pet named " + pet.getName());
    }
}

