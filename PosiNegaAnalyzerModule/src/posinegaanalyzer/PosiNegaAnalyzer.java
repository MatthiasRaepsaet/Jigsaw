package posinegaanalyzer;

import analyzer.Analyzer;

import java.util.List;

public class PosiNegaAnalyzer implements Analyzer {

    private static final String[] POSITIVEWORDS = {"enjoyable", "good", "helpful", "polite", "creative", "passionated"};
    private static final String[] NEGATIVEWORDS = {"angry", "jealouse", "brutal", "bitter", "chaotic", "ugly"};

    private int positive;
    private int negative;

    private String name;

    public PosiNegaAnalyzer() {
        this.name = "PosiNegaAnalyzer";
        this.positive = 0;
        this.negative = 0;
    }

    @Override
    public void analyze(List<String> input) {
        for(String string : input){
            for(String pos : POSITIVEWORDS){
                if(string.toLowerCase().contains(pos)){
                    setPositive(getPositive()+1);
                }
            }
            for(String neg : NEGATIVEWORDS){
                if(string.toLowerCase().contains(neg)){
                    setNegative(getNegative()+1);
                }
            }
        }
    }

    @Override
    public void printResult() {
        System.out.println("Here are the results:");
        System.out.println("Postive: " + getPositive());
        System.out.println("Negative: " + getNegative());
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getPositive() {
        return positive;
    }

    public void setPositive(int positive) {
        this.positive = positive;
    }

    public int getNegative() {
        return negative;
    }

    public void setNegative(int negative) {
        this.negative = negative;
    }
}
