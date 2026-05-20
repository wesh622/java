package cinema;

import java.util.List;

public abstract class AbstractVisualWork extends AbstractWork implements Taggable {

    public AbstractVisualWork(String director, int releaseYear) {
        super(director, releaseYear);
        // TODO
    }

    public void addTag(String tag) {
        // TODO
    }

    public void removeTag(String tag) {
        // TODO
    }

    public int tagsCount() {
        // TODO
        return 0;
    }

    public List<String> getTags() {
        // TODO
        return null;
    }
}
