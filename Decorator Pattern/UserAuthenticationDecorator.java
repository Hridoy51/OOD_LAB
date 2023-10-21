// UserAuthenticationDecorator.java
public class UserAuthenticationDecorator extends WebPageDecorator {
    public UserAuthenticationDecorator(WebPage decoratedPage) {
        super(decoratedPage);
    }

    @Override
    public void display() {
        super.display();
        authenticateUser();
    }

    private void authenticateUser() {
        System.out.println("User Authentication: User is authenticated.");
    }
}
