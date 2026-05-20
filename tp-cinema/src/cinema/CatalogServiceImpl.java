package cinema;

import java.util.*;

public class CatalogServiceImpl implements CatalogService {
    private String name;
    private ArrayList<Authorable> entries;

    public CatalogServiceImpl(String name) {
        this.name = name;
        this.entries = new ArrayList<Authorable>();
    }

    public String getName() {
        return this.name;
    }

    public void add(Authorable entry) {
        this.entries.add(entry);
    }

    public List<Authorable> getEntries() {
        return this.entries;
    }

    public int getEntriesCount() {
        return this.entries.size();
    }

    public int getTaggableEntriesCount() {
        int total = 0;
        for(Authorable elt : this.entries){
            if(elt instanceof Taggable){
                total++;
            }
        }
        return total;
    }

    public List<Authorable> findEntriesByDirector(String director) {
        ArrayList<Authorable> tab = new ArrayList<Authorable>();
        for(Authorable elt: this.entries){
            if(elt.getDirector().equals(director)){
                tab.add(elt);
            }
        }
        return ((List<Authorable>)tab);
    }

    public Datable getMostRecentEntry() {
        int year = 0;
        Datable result = null;
        for(Authorable elt: this.entries){
            if(elt instanceof AbstractWork ){
                AbstractWork r = (AbstractWork) elt;
                if(r.getReleaseYear() >= year){
                    result = (Datable) r;
                }
            }
        }
        return result;
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
