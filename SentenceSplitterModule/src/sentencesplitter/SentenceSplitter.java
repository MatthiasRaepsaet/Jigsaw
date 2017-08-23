package sentencesplitter;

import splitter.Splitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentenceSplitter implements Splitter {

    private String name;

    public SentenceSplitter() {
        this.name = "SentenceSplitter";
    }

    @Override
    public String getSplitterName() {
        return this.name;
    }

    @Override
    public List<String> split(String sentence) {
        System.out.println("Your sentence counts " + sentence.split(" ").length + " words");
        return new ArrayList<>(Arrays.asList(sentence.split(" ")));
    }
}
