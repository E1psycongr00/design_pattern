package pattern.structural.proxy;

public class ProxyThumbnail implements Thumbnail{
    String title;
    String movieUrl;

    private RealThumbnail realThumbnail;

    public ProxyThumbnail(String title, String movieUrl) {
        this.title = title;
        this.movieUrl = movieUrl;
    }

    @Override
    public void showText() {
        System.out.println(title);

    }

    @Override
    public void showPreview() {
        if(realThumbnail == null) {
            realThumbnail = new RealThumbnail(title, movieUrl);
        }
        realThumbnail.showPreview();
    }
}
