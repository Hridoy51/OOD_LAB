public class House implements HousingStructure{
    String name;
    public House(String name){
        this.name = name;
    }
    public void display(){
        System.out.println(name);
    }
}
