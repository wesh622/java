package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.ReflectionAssertions.*;

public class AbstractWorkDefTest {

    @Test
    public void testGetDirector() {
        assertDeclaredMethod("cinema.AbstractWork", "getDirector", new String[]{}, "missing method getDirector() in class AbstractWork");
        assertDeclaredMethodWithReturnType("cinema.AbstractWork", "getDirector", new String[]{}, "java.lang.String", "missing method getDirector() in class AbstractWork");
    }

    @Test
    public void testGetReleaseYear() {
        assertDeclaredMethod("cinema.AbstractWork", "getReleaseYear", new String[]{}, "missing method getReleaseYear() in class AbstractWork");
        assertDeclaredMethodWithReturnType("cinema.AbstractWork", "getReleaseYear", new String[]{}, "int", "missing method getReleaseYear() in class AbstractWork");
    }

    @Test
    public void testDeclaredConstructor() {
        assertDeclaredConstructor("cinema.AbstractWork", new String[]{"java.lang.String", "int"}, "missing constructor AbstractWork(String, int) in class AbstractWork");
    }
}
