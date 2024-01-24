public class Main {
    public static void main(String[] args) {
        // Creating instances of pets
        Dog dog1 = new Dog("Buddy", 3, "Labrador");
        Cat cat1 = new Cat("Whiskers", 2, true);
        Dog dog2 = new Dog("Max", 4, "Beagle");

        // Creating instances of customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Creating a PetShop
        PetShop petShop = new PetShop();

        // Adding pets to the PetShop
        petShop.addPet(dog1);
        petShop.addPet(cat1);
        petShop.addPet(dog2);

        // Adding customers to the PetShop
        petShop.addCustomer(customer1);
        petShop.addCustomer(customer2);

        // Displaying the pets in the PetShop
        petShop.displayPets();

        // Customers buying pets
        petShop.sellPet(customer1, dog1);
        petShop.sellPet(customer2, cat1);

        // Displaying updated list of pets
        //petShop.displayPets();
    }
}

