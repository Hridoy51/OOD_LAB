import java.util.ArrayList;
import java.util.List;
class Customer {
    //attributes.....
    private String customerId;
    private String name;
    private String customerGender;
    private int customerAge;
    private List<Pet> purchasedPets;
    
    //constructor.....
    public Customer(String customerId,String name, String customerGender,int customerAge) {
        this.name = name;
        this.customerId = customerId;
        this.customerGender = customerGender;
        this.customerAge = customerAge;
        this.purchasedPets = new ArrayList<>();
    }

    //getting a customer name 
    public String getName() {
        return name;
    }

    //getting customer id..
    public String getCustomerId() {
        return customerId;
    }

    //getting customer gender
    public String getCustomerGender() {
        return customerGender;
    }

    //gtting customers age..
    public int getCustomerAge() {
        return customerAge;
    }

    //getting purchased list of a customers..
    public List<Pet> getPurchasedPets() {
        return purchasedPets;
    }

    //add purchased pet to the list..
    public void purchasePet(Pet pet) {
        purchasedPets.add(pet);
    }

    @Override
    public String toString() {
        return "CustomerId: " +customerId+", Customer Name: " + name+", Customer Gender: " + customerGender+", Customer Age: "+customerAge;
    }
}
