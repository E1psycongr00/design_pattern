package pattern.structural.adapter;

import pattern.behavioral.strategy.SearchStrategy;

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
