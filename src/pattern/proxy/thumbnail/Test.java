package pattern.proxy.thumbnail;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Thumbnail> list = new ArrayList<>();
        list.add(new ProxyThumbnail("hello world", "x.mp4"));
        list.add(new ProxyThumbnail("haha", "y.mp4"));

        list.get(1).showText();
        list.get(1).showPreview();
    }
}
