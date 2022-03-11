package pattern.strategy.search;

public class MyProgram {
    private SearchButton searchButton = new SearchButton();

    public void setModeAll() {
        searchButton.setSearchStrategy(new SearchStrategyAll());
    }
    public void setModeImage() {
        searchButton.setSearchStrategy(new SearchStrategyAll());
    }
}
