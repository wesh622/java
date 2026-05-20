package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.ReflectionAssertions.*;

public class AbstractVisualWorkDefTest {

    @Test
    public void testAddTag() {
        assertDeclaredMethod("cinema.AbstractVisualWork", "addTag", new String[]{"java.lang.String"}, "missing method addTag(String) in class AbstractVisualWork");
        assertDeclaredMethodWithReturnType("cinema.AbstractVisualWork", "addTag", new String[]{"java.lang.String"}, "void", "missing method addTag(String) in class AbstractVisualWork");
    }

    @Test
    public void testRemoveTag() {
        assertDeclaredMethod("cinema.AbstractVisualWork", "removeTag", new String[]{"java.lang.String"}, "missing method removeTag(String) in class AbstractVisualWork");
        assertDeclaredMethodWithReturnType("cinema.AbstractVisualWork", "removeTag", new String[]{"java.lang.String"}, "void", "missing method removeTag(String) in class AbstractVisualWork");
    }

    @Test
    public void testTagsCount() {
        assertDeclaredMethod("cinema.AbstractVisualWork", "tagsCount", new String[]{}, "missing method tagsCount() in class AbstractVisualWork");
        assertDeclaredMethodWithReturnType("cinema.AbstractVisualWork", "tagsCount", new String[]{}, "int", "missing method tagsCount() in class AbstractVisualWork");
    }

    @Test
    public void testGetTags() {
        assertDeclaredMethod("cinema.AbstractVisualWork", "getTags", new String[]{}, "missing method getTags() in class AbstractVisualWork");
        assertDeclaredMethodWithReturnType("cinema.AbstractVisualWork", "getTags", new String[]{}, "java.util.List", "missing method getTags() in class AbstractVisualWork");
    }

    @Test
    public void testDeclaredConstructor() {
        assertDeclaredConstructor("cinema.AbstractVisualWork", new String[]{"java.lang.String", "int"}, "missing constructor AbstractVisualWork(String, int) in class AbstractVisualWork");
    }
}
