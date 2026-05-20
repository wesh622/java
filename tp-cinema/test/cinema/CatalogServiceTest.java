package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.ReflectionAssertions.*;

public class CatalogServiceTest {

    @Test
    public void testGetName() {
        assertDeclaredMethod("cinema.CatalogService", "getName", new String[]{}, "missing method getName() in interface CatalogService");
        assertDeclaredMethodWithReturnType("cinema.CatalogService", "getName", new String[]{}, "java.lang.String", "missing method getName() in interface CatalogService");
    }

    @Test
    public void testAdd() {
        assertDeclaredMethod("cinema.CatalogService", "add", new String[]{"cinema.Authorable"}, "missing method add(Authorable) in interface CatalogService");
        assertDeclaredMethodWithReturnType("cinema.CatalogService", "add", new String[]{"cinema.Authorable"}, "void", "missing method add(Authorable) in interface CatalogService");
    }

    @Test
    public void testGetEntries() {
        assertDeclaredMethod("cinema.CatalogService", "getEntries", new String[]{}, "missing method getEntries() in interface CatalogService");
        assertDeclaredMethodWithReturnType("cinema.CatalogService", "getEntries", new String[]{}, "java.util.List", "missing method getEntries() in interface CatalogService");
    }

    @Test
    public void testGetEntriesCount() {
        assertDeclaredMethod("cinema.CatalogService", "getEntriesCount", new String[]{}, "missing method getEntriesCount() in interface CatalogService");
        assertDeclaredMethodWithReturnType("cinema.CatalogService", "getEntriesCount", new String[]{}, "int", "missing method getEntriesCount() in interface CatalogService");
    }

    @Test
    public void testGetTaggableEntriesCount() {
        assertDeclaredMethod("cinema.CatalogService", "getTaggableEntriesCount", new String[]{}, "missing method getTaggableEntriesCount() in interface CatalogService");
        assertDeclaredMethodWithReturnType("cinema.CatalogService", "getTaggableEntriesCount", new String[]{}, "int", "missing method getTaggableEntriesCount() in interface CatalogService");
    }

    @Test
    public void testFindEntriesByDirector() {
        assertDeclaredMethod("cinema.CatalogService", "findEntriesByDirector", new String[]{"java.lang.String"}, "missing method findEntriesByDirector(String) in interface CatalogService");
        assertDeclaredMethodWithReturnType("cinema.CatalogService", "findEntriesByDirector", new String[]{"java.lang.String"}, "java.util.List", "missing method findEntriesByDirector(String) in interface CatalogService");
    }

    @Test
    public void testGetMostRecentEntry() {
        assertDeclaredMethod("cinema.CatalogService", "getMostRecentEntry", new String[]{}, "missing method getMostRecentEntry() in interface CatalogService");
        assertDeclaredMethodWithReturnType("cinema.CatalogService", "getMostRecentEntry", new String[]{}, "cinema.Datable", "missing method getMostRecentEntry() in interface CatalogService");
    }

    @Test
    public void testFindEntriesByTags() {
        assertDeclaredMethod("cinema.CatalogService", "findEntriesByTags", new Class<?>[]{String[].class}, "missing method findEntriesByTags(String[]) in interface CatalogService");
        assertDeclaredMethodWithReturnType("cinema.CatalogService", "findEntriesByTags", new Class<?>[]{String[].class}, "java.util.List", "missing method findEntriesByTags(String[]) in interface CatalogService");
    }

    @Test
    public void testFindEntriesBySynopsis() {
        assertDeclaredMethod("cinema.CatalogService", "findEntriesBySynopsis", new Class<?>[]{String[].class}, "missing method findEntriesBySynopsis(String[]) in interface CatalogService");
        assertDeclaredMethodWithReturnType("cinema.CatalogService", "findEntriesBySynopsis", new Class<?>[]{String[].class}, "java.util.List", "missing method findEntriesBySynopsis(String[]) in interface CatalogService");
    }

    @Test
    public void testFindEntriesByTagsOrSynopsis() {
        assertDeclaredMethod("cinema.CatalogService", "findEntriesByTagsOrSynopsis", new Class<?>[]{String[].class}, "missing method findEntriesByTagsOrSynopsis(String[]) in interface CatalogService");
        assertDeclaredMethodWithReturnType("cinema.CatalogService", "findEntriesByTagsOrSynopsis", new Class<?>[]{String[].class}, "java.util.List", "missing method findEntriesByTagsOrSynopsis(String[]) in interface CatalogService");
    }
}
