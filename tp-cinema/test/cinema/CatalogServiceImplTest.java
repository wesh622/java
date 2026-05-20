package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.ReflectionAssertions.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class CatalogServiceImplTest {

    @Test
    public void testSuperTypes() {
        cinema.CatalogServiceImpl c = new cinema.CatalogServiceImpl("My Catalog");
        assertInstanceOf(c, "cinema.CatalogService");
    }

    @Test
    public void testGetName() {
        cinema.CatalogServiceImpl c = new cinema.CatalogServiceImpl("My Catalog");
        assertEquals("My Catalog", c.getName());

        cinema.CatalogServiceImpl c2 = new cinema.CatalogServiceImpl("Nolan Collection");
        assertEquals("Nolan Collection", c2.getName());
    }

    @Test
    public void testAddAndGetEntriesCount() {
        cinema.CatalogServiceImpl c = new cinema.CatalogServiceImpl("My Catalog");
        assertEquals(0, c.getEntriesCount());

        cinema.Film f1 = new cinema.Film("Stanley Kubrick", 1968, "A space odyssey.");
        cinema.Film f2 = new cinema.Film("Ridley Scott", 1982, "A blade runner hunts replicants.");

        c.add(f1);
        assertEquals(1, c.getEntriesCount());
        assertTrue(c.getEntries().contains(f1), "catalog should contain f1");

        c.add(f2);
        assertEquals(2, c.getEntriesCount());
        assertTrue(c.getEntries().contains(f1), "catalog should contain f1");
        assertTrue(c.getEntries().contains(f2), "catalog should contain f2");
    }

    @Test
    public void testGetTaggableEntriesCount() {
        cinema.CatalogServiceImpl c = new cinema.CatalogServiceImpl("My Catalog");
        assertEquals(0, c.getTaggableEntriesCount());

        cinema.Movie m1 = new cinema.Movie("Christopher Nolan", 2010, "https://cdn.example.com/inception.mp4", 148);
        cinema.Movie m2 = new cinema.Movie("Denis Villeneuve", 2021, "https://cdn.example.com/dune.mp4", 155);
        cinema.Film f1 = new cinema.Film("Stanley Kubrick", 1968, "A space odyssey.");
        cinema.Series s1 = new cinema.Series("David Chase", 1999, "https://cdn.example.com/sopranos", "The Sopranos", 6);

        c.add(m1);
        assertEquals(1, c.getTaggableEntriesCount());
        c.add(f1);
        assertEquals(1, c.getTaggableEntriesCount()); // Film is not Taggable
        c.add(m2);
        assertEquals(2, c.getTaggableEntriesCount());
        c.add(s1);
        assertEquals(3, c.getTaggableEntriesCount());
    }

    @Test
    public void testFindEntriesByDirector() {
        cinema.CatalogServiceImpl c = new cinema.CatalogServiceImpl("My Catalog");

        cinema.Movie m1 = new cinema.Movie("Christopher Nolan", 2010, "https://cdn.example.com/inception.mp4", 148);
        cinema.Movie m2 = new cinema.Movie("Denis Villeneuve", 2021, "https://cdn.example.com/dune.mp4", 155);
        cinema.Film f1 = new cinema.Film("Christopher Nolan", 2014, "Mankind's last hope.");

        List<Authorable> res = c.findEntriesByDirector("Christopher Nolan");
        assertNotNull(res, "findEntriesByDirector() must never return null");
        assertEquals(0, res.size());

        c.add(m1);
        c.add(m2);
        c.add(f1);

        res = c.findEntriesByDirector("Christopher Nolan");
        assertEquals(2, res.size());
        assertTrue(res.contains(m1), "findEntriesByDirector() did not find m1");
        assertTrue(res.contains(f1), "findEntriesByDirector() did not find f1");
        assertFalse(res.contains(m2), "findEntriesByDirector() should not find m2");

        res = c.findEntriesByDirector("Denis Villeneuve");
        assertEquals(1, res.size());
        assertTrue(res.contains(m2), "findEntriesByDirector() did not find m2");
    }

    @Test
    public void testGetMostRecentEntry() {
        cinema.CatalogServiceImpl c = new cinema.CatalogServiceImpl("My Catalog");

        cinema.Film f1 = new cinema.Film("Stanley Kubrick", 1968, "A space odyssey.");
        cinema.Film f2 = new cinema.Film("Ridley Scott", 1982, "A blade runner hunts replicants.");
        cinema.Movie m1 = new cinema.Movie("Christopher Nolan", 2010, "https://cdn.example.com/inception.mp4", 148);

        assertNull(c.getMostRecentEntry());

        c.add(f1);
        assertEquals(f1, c.getMostRecentEntry());

        c.add(f2);
        assertEquals(f2, c.getMostRecentEntry()); // 1982 > 1968

        c.add(m1);
        assertEquals(m1, c.getMostRecentEntry()); // 2010 > 1982
    }

    @Test
    public void testFindEntriesByTags() {
        cinema.CatalogServiceImpl c = new cinema.CatalogServiceImpl("My Catalog");

        cinema.Movie m1 = new cinema.Movie("Christopher Nolan", 2010, "https://cdn.example.com/inception.mp4", 148);
        cinema.Movie m2 = new cinema.Movie("Denis Villeneuve", 2021, "https://cdn.example.com/dune.mp4", 155);
        cinema.Series s1 = new cinema.Series("Vince Gilligan", 2008, "https://cdn.example.com/bb", "Breaking Bad", 5);
        cinema.Film f1 = new cinema.Film("Ridley Scott", 1982, "A blade runner hunts replicants.");

        List<Taggable> res = c.findEntriesByTags(new String[]{"scifi"});
        assertNotNull(res, "findEntriesByTags() must never return null");
        assertEquals(0, res.size());

        c.add(m1);
        res = c.findEntriesByTags(new String[]{"scifi"});
        assertEquals(0, res.size());

        m1.addTag("scifi");
        res = c.findEntriesByTags(new String[]{"scifi"});
        assertEquals(1, res.size());
        assertTrue(res.contains(m1), "findEntriesByTags() did not find m1");

        c.add(m2);
        c.add(s1);
        c.add(f1);

        m2.addTag("scifi");
        m2.addTag("epic");
        res = c.findEntriesByTags(new String[]{"scifi"});
        assertEquals(2, res.size());

        res = c.findEntriesByTags(new String[]{"scifi", "epic"});
        assertEquals(1, res.size());
        assertTrue(res.contains(m2), "findEntriesByTags() did not find m2 with both tags");

        s1.addTag("crime");
        s1.addTag("drama");
        res = c.findEntriesByTags(new String[]{"crime"});
        assertEquals(1, res.size());
        assertTrue(res.contains(s1));
    }

    @Test
    public void testFindEntriesBySynopsis() {
        cinema.CatalogServiceImpl c = new cinema.CatalogServiceImpl("My Catalog");

        List<Film> res = c.findEntriesBySynopsis(new String[]{"space"});
        assertNotNull(res, "findEntriesBySynopsis() must never return null");
        assertEquals(0, res.size());

        cinema.Film f1 = new cinema.Film("Stanley Kubrick", 1968, "A space odyssey beyond human limits.");
        cinema.Film f2 = new cinema.Film("Ridley Scott", 1982, "A blade runner hunts replicants in a dark city.");
        cinema.Film f3 = new cinema.Film("Denis Villeneuve", 2016, "An astronaut survives alone on a hostile planet.");
        cinema.Movie m1 = new cinema.Movie("Christopher Nolan", 2010, "https://cdn.example.com/inception.mp4", 148);

        c.add(f1);
        res = c.findEntriesBySynopsis(new String[]{"space"});
        assertEquals(1, res.size());
        assertTrue(res.contains(f1));

        res = c.findEntriesBySynopsis(new String[]{"hunter"});
        assertEquals(0, res.size());

        c.add(f2);
        c.add(f3);
        c.add(m1); // Movie, not a Film — must not appear

        res = c.findEntriesBySynopsis(new String[]{"a"});
        assertEquals(3, res.size()); // all films contain "a"

        res = c.findEntriesBySynopsis(new String[]{"dark"});
        assertEquals(1, res.size());
        assertTrue(res.contains(f2));
    }

    @Test
    public void testFindEntriesByTagsOrSynopsis() {
        cinema.CatalogServiceImpl c = new cinema.CatalogServiceImpl("My Catalog");

        List<AbstractWork> res = c.findEntriesByTagsOrSynopsis(new String[]{"scifi"});
        assertNotNull(res, "findEntriesByTagsOrSynopsis() must never return null");
        assertEquals(0, res.size());

        cinema.Movie m1 = new cinema.Movie("Christopher Nolan", 2010, "https://cdn.example.com/inception.mp4", 148);
        cinema.Movie m2 = new cinema.Movie("Denis Villeneuve", 2021, "https://cdn.example.com/dune.mp4", 155);
        cinema.Film f1 = new cinema.Film("Stanley Kubrick", 1968, "A space odyssey beyond human limits.");
        cinema.Film f2 = new cinema.Film("Ridley Scott", 1982, "A blade runner hunts replicants in a dark scifi city.");

        m1.addTag("scifi");
        m1.addTag("thriller");
        m2.addTag("epic");

        c.add(m1);
        c.add(m2);
        c.add(f1);
        c.add(f2);

        // m1 has tag "scifi", f2 synopsis contains "scifi"
        res = c.findEntriesByTagsOrSynopsis(new String[]{"scifi"});
        assertEquals(2, res.size());
        assertTrue(res.contains(m1), "should find m1 (tagged scifi)");
        assertTrue(res.contains(f2), "should find f2 (synopsis contains scifi)");
        assertFalse(res.contains(m2), "should not find m2");
        assertFalse(res.contains(f1), "should not find f1");

        // m1 has BOTH "scifi" AND "thriller" tags
        res = c.findEntriesByTagsOrSynopsis(new String[]{"scifi", "thriller"});
        assertEquals(1, res.size());
        assertTrue(res.contains(m1));
    }
}
