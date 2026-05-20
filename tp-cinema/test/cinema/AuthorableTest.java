package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.ReflectionAssertions.*;

public class AuthorableTest {

    @Test
    public void testGetDirector() {
        assertDeclaredMethod("cinema.Authorable", "getDirector", new String[]{}, "missing method getDirector() in interface Authorable");
        assertDeclaredMethodWithReturnType("cinema.Authorable", "getDirector", new String[]{}, "java.lang.String", "missing method getDirector() in interface Authorable");
    }
}
