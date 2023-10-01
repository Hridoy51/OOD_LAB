import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PetSellingManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//for taking comandline input
        List<Pet> pets = new ArrayList<>();//creating pet inventory
        List<Customer> customers = new ArrayList<>();//creating customer array

        int mainMenu;
        while (true) {
            System.out.println();
            System.out.print("Type '0' to Get the main MENU: ");
            mainMenu = scanner.nextInt();
            scanner.nextLine();

            try {
                if(mainMenu == 0){
                //Alternative of user interface
                System.out.println("Options : ");
                System.out.println("1. Add PetInfo");
                System.out.println("2. Show List of Pets");
                System.out.println("3. Add CustomerInfo");
                System.out.println("4. Show List of Customers");
                System.out.println("5. Selling a Pet to a Customer");
                System.out.println("6. Show the list of pets Purchased by a Customer");
                System.out.println("7. All are Done ....Exit.........");
                System.out.print("Press the number that you want to do: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // read the newline

                //adding new pet info to the inventory..
                if(choice == 1){
                    System.out.print("Enter pet's ID: ");
                    String petId = scanner.nextLine();
                    System.out.print("Enter animalSpecis: ");//cat,dog,snake etc....
                    String animalSpecis = scanner.nextLine();
                    System.out.print("Enter pet's name: ");//name given by owner....
                    String petName = scanner.nextLine();
                    System.out.print("Enter pet's breed: ");//persian..etc..
                    String breed = scanner.nextLine();
                    System.out.print("Enter pet's Gender: ");//male,female....
                    String petGender = scanner.nextLine();
                    System.out.print("Enter pet's Color: ");//white,,black etc
                    String petColor = scanner.nextLine();
                    System.out.print("Enter pet's Height: ");
                    double petHeight = scanner.nextDouble(); 
                    System.out.print("Enter pet's Weight: ");
                    double petweight = scanner.nextDouble(); 
                    System.out.print("Enter pet's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // read the newline 
                    System.out.print("Enter pet owner's name: ");
                    String owner = scanner.nextLine();

                    //add to the inventory...
                    Pet addPet = findPetById(pets, petId);
                    if(addPet==null){
                        pets.add(new Pet(petId,animalSpecis, petName, breed, age,petGender,petColor,petHeight,petweight, owner));
                        System.out.println("Pet with petId "+petId+ " is added successfully.");
                    }
                    else{
                        System.out.println("Two pets Shouldn't have same ID..try new");
                        continue;
                    }
                    
                }
                //show the inventory..
                else if(choice==2){
                    System.out.print("List of Pets: ");
                    if(pets.size()==0){
                        System.out.println("No Pet found!!!!!!");//if no pets in inventory..
                    }
                    else{
                        System.out.println();
                        for (Pet pet : pets) {
                            System.out.println(pet);
                        }
                    }
                    
                }
                //adding new customer in town..
                else if(choice==3){
                    System.out.print("Enter customer's ID: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Enter customer's name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter customer's Gender: ");
                    String customerGender = scanner.nextLine();
                    System.out.print("Enter customer's Age: ");
                    int customerAge = scanner.nextInt();
                    scanner.nextLine();
                   
                    
                    //added the customer info to the customers list...
                    Customer addCustomer = findCustomerById(customers, customerId);
                    if(addCustomer==null){
                        customers.add(new Customer(customerId,customerName,customerGender,customerAge));
                        System.out.println("Customer with CustomerId "+customerId+" is added.");
                    }
                    else{
                        System.out.println("Two Customers Shouldn't have same ID..try new");
                    }
                    
                }
                //show the list of customers...
                else if(choice==4){
                    System.out.print("List of Customers: ");
                    if(customers.size()==0){
                        System.out.println("No Customer Found!!!!!");
                    }
                    else{
                        System.out.println();
                        for (Customer customer : customers) {
                            System.out.println(customer);
                        }
                    }
                    
                }
                //selling a pet from inventory...
                else if(choice==5){
                    System.out.print("Enter customer's ID: ");
                    String customerIdToSell = scanner.nextLine();
                    Customer customerToSell = findCustomerById(customers, customerIdToSell);

                    //check if the customer is appeared in the list or not..and do the actoin on these
                    if (customerToSell != null) {
                        System.out.print("Enter pet's Id to sell: ");
                        String petIdToSell = scanner.nextLine();
                        Pet petToSell = findPetById(pets, petIdToSell);
                        if (petToSell != null) {
                            customerToSell.purchasePet(petToSell);//added the pet to perchased list of a customer
                            pets.remove(petToSell);//remove the pet from inventory after selling...
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
                //show the perchased pet list of a customer...
                else if(choice==6){
                    System.out.print("Enter the CustomerId: ");
                    String customerId = scanner.nextLine();
                    Customer perchasedCustomer = findCustomerById(customers, customerId);
                    if(perchasedCustomer!=null){
                        if(perchasedCustomer.getPurchasedPets().size()==0){//if no perchased has done...
                            System.out.println("The customer with customerId "+customerId+" don't perchased anything..");
                        }
                        else{
                            System.out.println(perchasedCustomer.getName()+"Perchased :"+perchasedCustomer.getPurchasedPets());
                        }
                    }
                    else{
                        System.out.println("Customer Not Found!!!");
                    }
                    
                    
                }
                //exiting application....
                else if(choice==7){
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                }
                //if option is invalid..
                else{
                    System.out.println("Invalid choice. Try again.");
                }             
            }
            } catch (Exception e) {
                System.out.println("There is data type error in your input..try again..");
                continue;
            }
        }
        
    }

    //find a pet by it's id....
    private static Pet findPetById(List<Pet> pets, String petId) {
        for (Pet pet : pets) {
            if (pet.getPetId().equalsIgnoreCase(petId)) {
                return pet;
            }
        }
        return null;
    }

    //find a customer by his/her id...
    private static Customer findCustomerById(List<Customer> customers, String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equalsIgnoreCase(customerId)) {
                return customer;
            }
        }
        return null;
    }
}
