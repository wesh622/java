package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.ReflectionAssertions.*;

public class SeriesDefTest {

    @Test
    public void testGetURL() {
        assertDeclaredMethod("cinema.Series", "getURL", new String[]{}, "missing method getURL() in class Series");
        assertDeclaredMethodWithReturnType("cinema.Series", "getURL", new String[]{}, "java.lang.String", "missing method getURL() in class Series");
    }

    @Test
    public void testGetTitle() {
        assertDeclaredMethod("cinema.Series", "getTitle", new String[]{}, "missing method getTitle() in class Series");
        assertDeclaredMethodWithReturnType("cinema.Series", "getTitle", new String[]{}, "java.lang.String", "missing method getTitle() in class Series");
    }

    @Test
    public void testGetSeasons() {
        assertDeclaredMethod("cinema.Series", "getSeasons", new String[]{}, "missing method getSeasons() in class Series");
        assertDeclaredMethodWithReturnType("cinema.Series", "getSeasons", new String[]{}, "int", "missing method getSeasons() in class Series");
    }

    @Test
    public void testDeclaredConstructor() {
        assertDeclaredConstructor("cinema.Series", new String[]{"java.lang.String", "int", "java.lang.String", "java.lang.String", "int"}, "missing constructor Series(String, int, String, String, int) in class Series");
    }

    @Test
    public void testSuperTypes() {
        cinema.Series s = new cinema.Series("David Chase", 1999, "https://cdn.example.com/sopranos", "The Sopranos", 6);
        assertInstanceOf(s, "cinema.Series");
        assertInstanceOf(s, "cinema.AbstractVisualWork");
        assertInstanceOf(s, "cinema.AbstractWork");
        assertInstanceOf(s, "cinema.Authorable");
        assertInstanceOf(s, "cinema.Datable");
        assertInstanceOf(s, "cinema.Taggable");
    }
}
