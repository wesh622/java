package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.ReflectionAssertions.*;

public class MovieDefTest {

    @Test
    public void testGetURL() {
        assertDeclaredMethod("cinema.Movie", "getURL", new String[]{}, "missing method getURL() in class Movie");
        assertDeclaredMethodWithReturnType("cinema.Movie", "getURL", new String[]{}, "java.lang.String", "missing method getURL() in class Movie");
    }

    @Test
    public void testGetDuration() {
        assertDeclaredMethod("cinema.Movie", "getDuration", new String[]{}, "missing method getDuration() in class Movie");
        assertDeclaredMethodWithReturnType("cinema.Movie", "getDuration", new String[]{}, "int", "missing method getDuration() in class Movie");
    }

    @Test
    public void testDeclaredConstructor() {
        assertDeclaredConstructor("cinema.Movie", new String[]{"java.lang.String", "int", "java.lang.String", "int"}, "missing constructor Movie(String, int, String, int) in class Movie");
    }

    @Test
    public void testSuperTypes() {
        cinema.Movie m = new cinema.Movie("Christopher Nolan", 2010, "https://cdn.example.com/inception.mp4", 148);
        assertInstanceOf(m, "cinema.Movie");
        assertInstanceOf(m, "cinema.AbstractVisualWork");
        assertInstanceOf(m, "cinema.AbstractWork");
        assertInstanceOf(m, "cinema.Authorable");
        assertInstanceOf(m, "cinema.Datable");
        assertInstanceOf(m, "cinema.Taggable");
    }
}
