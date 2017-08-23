package textsplitter;

import splitter.Splitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextSplitter implements Splitter {

    private String name;

    public TextSplitter() {
        this.name = "TextSplitter";
    }

    @Override
    public List<String> split(String text) {
        System.out.println("Your text counts" + text.split(".").length + "sentences");
        return new ArrayList<String>(Arrays.asList(text.split(".")));
    }

    @Override
    public String getSplitterName() {
        return this.name;
    }
}
