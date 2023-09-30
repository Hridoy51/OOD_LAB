class Pet {
    //attributes
    private String petId;
    private String animalSpecis;
    private String name;
    private String breed;
    private int age;
    private String gender;
    private String color;
    private double height;
    private double weight;
    private String owner;
    
    //constructor..
    public Pet(String petId,String animalSpecis, String name, String breed, int age,String gender,String color, double height, double weight, String owner) {
        this.petId = petId;
        this.animalSpecis = animalSpecis;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.owner = owner;
    }
    //getting petid..
    public String getPetId() {
        return petId;
    }
    
    //getting a animal or pet specis..
    public String getanimalSpecis() {
        return animalSpecis;
    }
    //getting a pet name given by the owner..
    public String getName() {
        return name;
    }

    //getting the breed..
    public String getBreed() {
        return breed;
    }
    
    //getting the age of a pet..
    public int getAge() {
        return age;
    }

    //getting the gender of a pet..
    public String getGender() {
        return gender;
    }

    //getting the body color of a pet..
    public String getColor() {
        return color;
    }

    //getting the height..
    public double getHeight() {
        return height;
    }

    //get the weight...
    public double getWeight() {
        return weight;
    }

    //get the ownerName of a pet...
    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "PetId: " + petId+", AnimalSpecis: "+animalSpecis+", Name: " + name + ", Breed: " + breed + ", Age: " + age + ", Gender: "+ gender +", Color: " + color+", Height: "+height+", Weight: "+weight+", Owner: " + owner;
    }
}