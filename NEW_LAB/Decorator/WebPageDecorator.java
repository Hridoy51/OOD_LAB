

public abstract class WebPageDecorator implements Webpage{

    protected Webpage decoratedPage;
    public WebPageDecorator(Webpage webpage){
        this.decoratedPage = webpage;
    }

    @Override
    public void display() {
        decoratedPage.display();
    }
    
}
