package cinema;

public class Film extends AbstractWork {
    private String synopsis;

    public Film(String director, int releaseYear, String synopsis) {
        super(director, releaseYear);
        this.synopsis = synopsis;
    }

    public String getSynopsis() {
        return this.synopsis;
    }
}
