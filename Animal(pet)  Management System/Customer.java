import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Customer {
    private String customerId;
    private String name;
    private String customerGender;
    private String customerAge;
    private List<Pet> purchasedPets;

    public Customer(String name) {
        this.name = name;
        this.customerId = customerId;
        this.customerGender = customerGender;
        this.customerAge = customerAge;
        this.purchasedPets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public String getCustomerId() {
        return customerId;
    }
    public String getCustomerGender() {
        return customerGender;
    }
    public String getCustomerAge() {
        return customerAge;
    }
    public List<Pet> getPurchasedPets() {
        return purchasedPets;
    }

    public void purchasePet(Pet pet) {
        purchasedPets.add(pet);
    }

    @Override
    public String toString() {
        return "CustomerId: " +customerId+", Customer Name: " + name+", Customer Gender: " + customerGender+", Customer Age: "+customerAge;
    }
}
