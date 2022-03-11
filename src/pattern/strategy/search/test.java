package pattern.strategy.search;

import pattern.strategy.search.SearchButton;
import pattern.strategy.search.SearchStrategyImage;

public class test {
    public static void main(String[] args) {
        SearchButton searchButton = new SearchButton();
        searchButton.onClick();
        searchButton.setSearchStrategy(new SearchStrategyImage());
        searchButton.onClick();
    }
}
