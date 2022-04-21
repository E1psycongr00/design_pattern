package pattern.structural.proxy;

public class RealThumbnail implements Thumbnail{
    String title;
    String movieUrl;

    public RealThumbnail(String title, String movieUrl) {
        this.title = title;
        this.movieUrl = movieUrl;
    }

    @Override
    public void showText() {
        System.out.println(title);
    }

    @Override
    public void showPreview() {
        System.out.println(movieUrl);
    }
}
