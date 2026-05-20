package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.ReflectionAssertions.*;
import java.util.List;

public class TaggableTest {

    @Test
    public void testAddTag() {
        assertDeclaredMethod("cinema.Taggable", "addTag", new String[]{"java.lang.String"}, "missing method addTag(String) in interface Taggable");
        assertDeclaredMethodWithReturnType("cinema.Taggable", "addTag", new String[]{"java.lang.String"}, "void", "missing method addTag(String) in interface Taggable");
    }

    @Test
    public void testRemoveTag() {
        assertDeclaredMethod("cinema.Taggable", "removeTag", new String[]{"java.lang.String"}, "missing method removeTag(String) in interface Taggable");
        assertDeclaredMethodWithReturnType("cinema.Taggable", "removeTag", new String[]{"java.lang.String"}, "void", "missing method removeTag(String) in interface Taggable");
    }

    @Test
    public void testTagsCount() {
        assertDeclaredMethod("cinema.Taggable", "tagsCount", new String[]{}, "missing method tagsCount() in interface Taggable");
        assertDeclaredMethodWithReturnType("cinema.Taggable", "tagsCount", new String[]{}, "int", "missing method tagsCount() in interface Taggable");
    }

    @Test
    public void testGetTags() {
        assertDeclaredMethod("cinema.Taggable", "getTags", new String[]{}, "missing method getTags() in interface Taggable");
        assertDeclaredMethodWithReturnType("cinema.Taggable", "getTags", new String[]{}, List.class, "missing method getTags() in interface Taggable");
    }
}
