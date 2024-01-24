import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private List<Pet> pets;
    private List<Customer> customers;

    public PetShop() {
        this.pets = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayPets() {
        System.out.println("Pets in the Pet Shop:");
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " - Age: " + pet.getAge() + " - Sound: " + pet.makeSound());
            if (pet instanceof Dog) {
                System.out.println("Breed: " + ((Dog) pet).getBreed());
            } else if (pet instanceof Cat) {
                System.out.println("Indoor: " + ((Cat) pet).isIndoor());
            }
            System.out.println();
        }
    }

    public void sellPet(Customer customer, Pet pet) {
        if (pets.contains(pet)) {
            pets.remove(pet);
            customer.buyPet(pet);
        } else {
            System.out.println("Pet not available for sale.");
        }
    }
}

