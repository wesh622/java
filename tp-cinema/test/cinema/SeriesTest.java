package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SeriesTest {

    @Test
    public void testGetURL() {
        cinema.Series s = new cinema.Series("David Chase", 1999, "https://cdn.example.com/sopranos", "The Sopranos", 6);
        assertEquals("https://cdn.example.com/sopranos", s.getURL());
    }

    @Test
    public void testGetTitle() {
        cinema.Series s = new cinema.Series("David Chase", 1999, "https://cdn.example.com/sopranos", "The Sopranos", 6);
        assertEquals("The Sopranos", s.getTitle());

        cinema.Series s2 = new cinema.Series("Vince Gilligan", 2008, "https://cdn.example.com/bb", "Breaking Bad", 5);
        assertEquals("Breaking Bad", s2.getTitle());
    }

    @Test
    public void testGetSeasons() {
        cinema.Series s = new cinema.Series("David Chase", 1999, "https://cdn.example.com/sopranos", "The Sopranos", 6);
        assertEquals(6, s.getSeasons());

        cinema.Series s2 = new cinema.Series("Vince Gilligan", 2008, "https://cdn.example.com/bb", "Breaking Bad", 5);
        assertEquals(5, s2.getSeasons());
    }

    @Test
    public void testGetDirectorAndYear() {
        cinema.Series s = new cinema.Series("David Chase", 1999, "https://cdn.example.com/sopranos", "The Sopranos", 6);
        assertEquals("David Chase", s.getDirector());
        assertEquals(1999, s.getReleaseYear());
    }
}
