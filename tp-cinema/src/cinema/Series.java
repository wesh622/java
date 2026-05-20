package cinema;

public class Series extends AbstractVisualWork {
    private String url;
    private String title;
    private int seasons;

    public Series(String director, int releaseYear, String url, String title, int seasons) {
        super(director, releaseYear);
        this.url = url;
        this.title = title;
        this.seasons = seasons;
    }

    public String getURL() {
        // TODO
        return this.url;
    }

    public String getTitle() {
        // TODO
        return this.title;
    }

    public int getSeasons() {
        // TODO
        return this.seasons;
    }
}
