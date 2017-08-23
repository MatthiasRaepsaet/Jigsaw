package analyzer;

import java.util.List;

/**
 * Created by Matthias on 27/05/2017.
 */
public interface Analyzer {
    public void analyze(List<String> input);
    public void printResult();
    public String getName();
}
