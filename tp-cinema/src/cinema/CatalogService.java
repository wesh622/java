package cinema;

import java.util.List;

public interface CatalogService {
    String getName();
    void add(Authorable entry);
    List<Authorable> getEntries();
    int getEntriesCount();
    int getTaggableEntriesCount();
    List<Authorable> findEntriesByDirector(String director);
    Datable getMostRecentEntry();
    List<Taggable> findEntriesByTags(String[] tags);
    List<Film> findEntriesBySynopsis(String[] words);
    List<AbstractWork> findEntriesByTagsOrSynopsis(String[] words);
}
