

public class AuthenticatedPage extends WebPageDecorator{

    public AuthenticatedPage(Webpage webpage) {
        super(webpage);
    }
    public void authenticate(){
        System.out.println("Authenticted user");
    }
    public void display(){
        super.display();
        this.authenticate();
    }
    
}
