

public class Main {
    public static void main(String[] args) {
        Webpage bwp = new BasicWebPage();
        bwp.display();
        bwp = new AuthenticatedPage(bwp);
        bwp = new AuthorizedPage(bwp);
        bwp.display();
    }
}
