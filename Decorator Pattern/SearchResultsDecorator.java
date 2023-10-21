// SearchResultsDecorator.java
public class SearchResultsDecorator extends WebPageDecorator {
    public SearchResultsDecorator(WebPage decoratedPage) {
        super(decoratedPage);
    }

    @Override
    public void display() {
        super.display();
        splitSearchResults();
    }

    private void splitSearchResults() {
        System.out.println("Search Results Split: Displaying search results on multiple pages.");
    }
}
