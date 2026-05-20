package cinema;

import java.util.List;

public interface Taggable {
    void addTag(String tag);
    void removeTag(String tag);
    int tagsCount();
    List<String> getTags();
}
