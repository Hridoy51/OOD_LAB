// DecoratorPatternDemo.java
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        WebPage basicPage = new BasicWebPage();
        System.out.println("Initial Page:\n");
        basicPage.display();
        System.out.println();
        System.out.println();
        System.out.println();

        WebPage authenticatedPage = new UserAuthenticationDecorator(basicPage);
        System.out.println("Web Page after User Authentication:\n");
        authenticatedPage.display();
        System.out.println();
        System.out.println();
        System.out.println();

        WebPage finalPage = new SearchResultsDecorator(authenticatedPage);
        System.out.println("Web Page after Search Results Splitting:\n");
        finalPage.display();
    }
}
