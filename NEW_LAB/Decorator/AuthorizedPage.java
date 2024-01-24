

public class AuthorizedPage extends WebPageDecorator{

    public AuthorizedPage(Webpage webpage) {
        super(webpage);
    }
    public void authenticate(){
        System.out.println("Authorized user");
    }
    public void display(){
        super.display();
        this.authenticate();
    }
    
}
