
public class Appartment implements HousingStructure{
    String name;
    public Appartment(String name){
        this.name = name;
    }
    public void display(){
        System.out.println(name);
    }
}
