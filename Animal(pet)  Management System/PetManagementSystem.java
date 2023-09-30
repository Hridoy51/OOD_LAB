import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PetManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pet> pets = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();

        while (true) {
            System.out.println("Options : ");
            System.out.println("1. Add PetInfo");
            System.out.println("2. Show List of Pets");
            System.out.println("3. Add CustomerInfo");
            System.out.println("4. Show List of Customers");
            System.out.println("5. Selling a Pet to a Customer");
            System.out.println("6. All are Done ....Exit.........");
            System.out.print("Press the number that you want to do: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if(choice == 1){
                System.out.print("Enter pet's ID: ");
                String petId = scanner.nextLine();
                System.out.print("Enter pet's name: ");
                String petName = scanner.nextLine();
                System.out.print("Enter pet's breed: ");
                String breed = scanner.nextLine();
                System.out.print("Enter pet's Gender: ");
                String petGender = scanner.nextLine();
                System.out.print("Enter pet's Color: ");
                String petColor = scanner.nextLine();
                System.out.print("Enter pet's Height: ");
                double petHeight = scanner.nextDouble();
                System.out.print("Enter pet's Weight: ");
                double petweight = scanner.nextDouble();
                System.out.print("Enter pet's age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                System.out.print("Enter pet owner's name: ");
                String owner = scanner.nextLine();
                pets.add(new Pet(petId, petName, breed, age,petGender,petColor,petHeight,petweight, owner));
                System.out.println("Pet with petId "+petId+ "is added successfully.");
            }
            else if(choice==2){
                System.out.println("List of Pets:");
                if(pets.size()==0){
                    System.out.println("No Pet found!!!!!!");
                }
                else{
                    for (Pet pet : pets) {
                        System.out.println(pet);
                    }
                }
                
            }
            else if(choice==3){
                System.out.print("Enter customer's ID: ");
                String customerId = scanner.nextLine();
                System.out.print("Enter customer's name: ");
                String customerName = scanner.nextLine();
                System.out.print("Enter customer's Gender: ");
                String customerGender = scanner.nextLine();
                System.out.print("Enter customer's Age: ");
                String customerAge = scanner.nextLine();
                customers.add(new Customer(customerId,customerName,customerGender,customerAge));
                System.out.println("Customer with CustomerId "+customerId+"is added.");
            }
            else if(choice==4){
                System.out.println("List of Customers:");
                if(customers.size()==0){
                    System.out.println("No Customer Found!!!!!");
                }
                else{
                    for (Customer customer : customers) {
                        System.out.println(customer);
                    }
                }
                
            }
            else if(choice==5){
                System.out.print("Enter customer's ID: ");
                String customerIdToSell = scanner.nextLine();
                Customer customerToSell = findCustomerById(customers, customerIdToSell);
                if (customerToSell != null) {
                    System.out.print("Enter pet's Id to sell: ");
                    String petIdToSell = scanner.nextLine();
                    Pet petToSell = findPetById(pets, petIdToSell);
                    if (petToSell != null) {
                        customerToSell.purchasePet(petToSell);
                        pets.remove(petToSell);
                        System.out.println("Pet with pet id "+petIdToSell+" sold to " + customerToSell.getName() + ".");
                    } 
                    else {
                        System.out.println("Pet not found in inventory!!!!.");
                    }
                } 
                else {
                    System.out.println("Customer not found!!!!!!.");
                }
            }
            else if(choice==6){
                 System.out.println("Exiting the program.");
                scanner.close();
                System.exit(0);
            }
            else{
                System.out.println("Invalid choice. Try again.");
            }             
        }
    }

    private static Pet findPetById(List<Pet> pets, String petId) {
        for (Pet pet : pets) {
            if (pet.getPetId().equalsIgnoreCase(petId)) {
                return pet;
            }
        }
        return null;
    }

    private static Customer findCustomerById(List<Customer> customers, String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equalsIgnoreCase(customerId)) {
                return customer;
            }
        }
        return null;
    }
}
