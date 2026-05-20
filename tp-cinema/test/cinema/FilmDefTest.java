package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.ReflectionAssertions.*;

public class FilmDefTest {

    @Test
    public void testGetSynopsis() {
        assertDeclaredMethod("cinema.Film", "getSynopsis", new String[]{}, "missing method getSynopsis() in class Film");
        assertDeclaredMethodWithReturnType("cinema.Film", "getSynopsis", new String[]{}, "java.lang.String", "missing method getSynopsis() in class Film");
    }

    @Test
    public void testDeclaredConstructor() {
        assertDeclaredConstructor("cinema.Film", new String[]{"java.lang.String", "int", "java.lang.String"}, "missing constructor Film(String, int, String) in class Film");
    }

    @Test
    public void testSuperTypes() {
        cinema.Film f = new cinema.Film("Stanley Kubrick", 1968, "A space odyssey.");
        assertInstanceOf(f, "cinema.Film");
        assertInstanceOf(f, "cinema.AbstractWork");
        assertInstanceOf(f, "cinema.Authorable");
        assertInstanceOf(f, "cinema.Datable");
    }
}
