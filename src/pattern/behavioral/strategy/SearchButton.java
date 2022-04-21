package pattern.behavioral.strategy;

public class SearchButton {

    // 전략 인터페이스 객체
    private SearchStrategy searchStrategy;

    public void setSearchStrategy(SearchStrategy searchStrategy) {

        this.searchStrategy = searchStrategy;
    }
    //
    public void onClick() {
        searchStrategy.search();
    }
}
