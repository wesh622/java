package cinema;

public class Movie extends AbstractVisualWork {
    private String url;
    private int duration;

    public Movie(String director, int releaseYear, String url, int duration) {
        super(director, releaseYear);
        this.url = url;
        this.duration = duration;
    }

    public String getURL() {
        return this.url;
    }

    public int getDuration() {
        return this.duration;
    }
}
