package pattern.adapt.find;

public interface FindAlgorithm {
    public void find(boolean condition);
}

class MovieFindAlgorithm  implements  FindAlgorithm{

    @Override
    public void find(boolean condition) {
        if(condition == true) {
            System.out.println("동영상 찾기~~!!!");
        } else {
            System.out.println("not found");
        }

    }
}
