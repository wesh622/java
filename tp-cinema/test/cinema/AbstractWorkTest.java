package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.ReflectionAssertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class AbstractWorkTest {

    class MyWork extends cinema.AbstractWork {
        public MyWork(String director, int releaseYear) {
            super(director, releaseYear);
        }
    }

    @Test
    public void testSuperTypes() {
        MyWork w = new MyWork("Christopher Nolan", 2010);
        assertInstanceOf(w, "cinema.AbstractWork");
        assertInstanceOf(w, "cinema.Authorable");
        assertInstanceOf(w, "cinema.Datable");
    }

    @Test
    public void testGetDirector() {
        MyWork w = new MyWork("Christopher Nolan", 2010);
        assertEquals("Christopher Nolan", w.getDirector());

        MyWork w2 = new MyWork("Denis Villeneuve", 2021);
        assertEquals("Denis Villeneuve", w2.getDirector());
    }

    @Test
    public void testGetReleaseYear() {
        MyWork w = new MyWork("Christopher Nolan", 2010);
        assertEquals(2010, w.getReleaseYear());

        MyWork w2 = new MyWork("Denis Villeneuve", 2021);
        assertEquals(2021, w2.getReleaseYear());
    }
}
