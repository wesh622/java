package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

    @Test
    public void testGetURL() {
        cinema.Movie m = new cinema.Movie("Christopher Nolan", 2010, "https://cdn.example.com/inception.mp4", 148);
        assertEquals("https://cdn.example.com/inception.mp4", m.getURL());
    }

    @Test
    public void testGetDuration() {
        cinema.Movie m = new cinema.Movie("Christopher Nolan", 2010, "https://cdn.example.com/inception.mp4", 148);
        assertEquals(148, m.getDuration());

        cinema.Movie m2 = new cinema.Movie("Denis Villeneuve", 2021, "https://cdn.example.com/dune.mp4", 155);
        assertEquals(155, m2.getDuration());
    }

    @Test
    public void testGetDirectorAndYear() {
        cinema.Movie m = new cinema.Movie("Christopher Nolan", 2010, "https://cdn.example.com/inception.mp4", 148);
        assertEquals("Christopher Nolan", m.getDirector());
        assertEquals(2010, m.getReleaseYear());
    }
}
