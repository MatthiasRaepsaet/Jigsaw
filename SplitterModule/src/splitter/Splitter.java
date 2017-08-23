package splitter;

import java.util.List;

public interface Splitter {
    public String getSplitterName();

    public <T> T split(String input);

}
