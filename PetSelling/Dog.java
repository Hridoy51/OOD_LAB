public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }

    public String getBreed() {
        return breed;
    }
}