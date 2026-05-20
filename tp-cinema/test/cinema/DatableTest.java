package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.ReflectionAssertions.*;

public class DatableTest {

    @Test
    public void testGetReleaseYear() {
        assertDeclaredMethod("cinema.Datable", "getReleaseYear", new String[]{}, "missing method getReleaseYear() in interface Datable");
        assertDeclaredMethodWithReturnType("cinema.Datable", "getReleaseYear", new String[]{}, "int", "missing method getReleaseYear() in interface Datable");
    }
}
