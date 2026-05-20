package cinema;

public abstract class AbstractWork implements Authorable, Datable {
    private String director;
    private int releaseYear;

    public AbstractWork(String director, int releaseYear) {
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getDirector() {
        return this.director;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }
}
