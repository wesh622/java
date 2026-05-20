package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FilmTest {

    @Test
    public void testGetSynopsis() {
        cinema.Film f = new cinema.Film("Stanley Kubrick", 1968, "A space odyssey.");
        assertEquals("A space odyssey.", f.getSynopsis());

        cinema.Film f2 = new cinema.Film("Ridley Scott", 1982, "A blade runner hunts replicants.");
        assertEquals("A blade runner hunts replicants.", f2.getSynopsis());
    }

    @Test
    public void testGetDirectorAndYear() {
        cinema.Film f = new cinema.Film("Stanley Kubrick", 1968, "A space odyssey.");
        assertEquals("Stanley Kubrick", f.getDirector());
        assertEquals(1968, f.getReleaseYear());
    }
}
