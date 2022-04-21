package pattern.behavioral.strategy;

public class test {
    public static void main(String[] args) {
        SearchButton searchButton = new SearchButton();
        searchButton.onClick();
        searchButton.setSearchStrategy(new SearchStrategyImage());
        searchButton.onClick();
    }
}
