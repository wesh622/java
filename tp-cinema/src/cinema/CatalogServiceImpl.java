package cinema;

import java.util.List;

public class CatalogServiceImpl implements CatalogService {

    public CatalogServiceImpl(String name) {
        // TODO
    }

    public String getName() {
        // TODO
        return null;
    }

    public void add(Authorable entry) {
        // TODO
    }

    public List<Authorable> getEntries() {
        // TODO
        return null;
    }

    public int getEntriesCount() {
        // TODO
        return 0;
    }

    public int getTaggableEntriesCount() {
        // TODO
        return 0;
    }

    public List<Authorable> findEntriesByDirector(String director) {
        // TODO
        return null;
    }

    public Datable getMostRecentEntry() {
        // TODO
        return null;
    }

    public List<Taggable> findEntriesByTags(String[] tags) {
        // TODO
        return null;
    }

    public List<Film> findEntriesBySynopsis(String[] words) {
        // TODO
        return null;
    }

    public List<AbstractWork> findEntriesByTagsOrSynopsis(String[] words) {
        // TODO
        return null;
    }
}
