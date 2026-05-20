package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.ReflectionAssertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class AbstractVisualWorkTest {

    class MyVisual extends cinema.AbstractVisualWork {
        public MyVisual(String director, int releaseYear) {
            super(director, releaseYear);
        }
    }

    @Test
    public void testSuperTypes() {
        MyVisual v = new MyVisual("Luc Besson", 1994);
        assertInstanceOf(v, "cinema.AbstractVisualWork");
        assertInstanceOf(v, "cinema.AbstractWork");
        assertInstanceOf(v, "cinema.Authorable");
        assertInstanceOf(v, "cinema.Datable");
        assertInstanceOf(v, "cinema.Taggable");
    }

    @Test
    public void testAddAndGetTag() {
        MyVisual v = new MyVisual("Luc Besson", 1994);

        assertEquals(0, v.tagsCount());
        v.addTag("action");
        assertEquals(1, v.tagsCount());
        assertTrue(v.getTags().contains("action"), "tag 'action' is missing");

        v.addTag("action");
        assertEquals(1, v.tagsCount()); // no duplicates

        v.addTag("thriller");
        assertEquals(2, v.tagsCount());
        assertTrue(v.getTags().contains("action"), "tag 'action' is missing");
        assertTrue(v.getTags().contains("thriller"), "tag 'thriller' is missing");

        v.addTag(null);
        assertEquals(2, v.tagsCount()); // null must not be added
    }

    @Test
    public void testRemoveTag() {
        MyVisual v = new MyVisual("Luc Besson", 1994);

        v.removeTag(null);
        assertEquals(0, v.tagsCount());

        v.addTag("action");
        v.removeTag("action");
        assertEquals(0, v.tagsCount());
        assertFalse(v.getTags().contains("action"), "tag 'action' should have been removed");

        v.addTag("action");
        v.addTag("thriller");
        v.addTag("scifi");
        v.removeTag(null);
        assertEquals(3, v.tagsCount());

        v.removeTag("thriller");
        assertEquals(2, v.tagsCount());
        assertFalse(v.getTags().contains("thriller"), "tag 'thriller' should have been removed");
        assertTrue(v.getTags().contains("action"), "tag 'action' is missing");
        assertTrue(v.getTags().contains("scifi"), "tag 'scifi' is missing");
    }
}
