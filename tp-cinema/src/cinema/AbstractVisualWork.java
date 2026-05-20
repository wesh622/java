package cinema;

import java.util.*;

public abstract class AbstractVisualWork extends AbstractWork implements Taggable {
    private ArrayList<String> tag;

    public AbstractVisualWork(String director, int releaseYear) {
        super(director, releaseYear);
        this.tag = new ArrayList<String>();
    }

    public void addTag(String tag) {
        this.tag.add(tag);
    }

    public void removeTag(String tag) {
        this.tag.remove(tag);
    }

    public int tagsCount() {
        return this.tag.size();
    }

    public List<String> getTags() {
        return ((List<String>)this.tag);
    }


}
