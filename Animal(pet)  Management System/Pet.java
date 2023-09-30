import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Pet {
    //attributes
    private String petId;
    private String name;
    private String breed;
    private int age;
    private String gender;
    private String color;
    private double height;
    private double weight;
    private String owner;
    
    public Pet(String petId, String name, String breed, int age,String gender,String color, double height, double weight, String owner) {
        this.petId = petId;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.owner = owner;
    }
    public String getPetId() {
        return petId;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getColor() {
        return color;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "PetId: " + petId+", Name: " + name + ", Breed: " + breed + ", Age: " + age + ", Gender: "+ gender +", Color: " + color+", Height: "+height+", Weight: "+weight+", Owner: " + owner;
    }
}