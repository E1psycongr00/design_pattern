package pattern.adapt.find;

import pattern.strategy.search.SearchStrategy;

public class SearchAdapter implements SearchStrategy {

    private FindAlgorithm findAlgorithm;

    public SearchAdapter(FindAlgorithm findAlgorithm) {
        this.findAlgorithm = findAlgorithm;
    }

    @Override
    public void search() {
        findAlgorithm.find(true);
    }
}
