package pattern.adapt.find;

import pattern.strategy.search.SearchButton;

public class Test {
    public static void main(String[] args) {
        SearchButton searchButton = new SearchButton();
        searchButton.setSearchStrategy(new SearchAdapter(new MovieFindAlgorithm()));
        searchButton.onClick();
    }
}
