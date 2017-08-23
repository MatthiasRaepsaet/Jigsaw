package emotionanalyzer;

import analyzer.Analyzer;

import java.util.List;

public class EmotionAnalyzer implements Analyzer {

    private static final String[] SAD = {"depressed", "lame", "blue"};
    private static final String[] ANGRY = {"hate", "furious", "disgust"};
    private static final String[] HAPPY = {"love", "beautiful", "adore", "enthousiast"};
    private static final String[] SCARED = {"petrified", "chill", "terrified"};

    private int sadCount;
    private int angryCount;
    private int happyCount;
    private int scaredCount;

    private String name;

    public EmotionAnalyzer() {
        this.name = "EmotionAnalyzer";
        this.sadCount = 0;
        this.angryCount = 0;
        this.happyCount = 0;
        this.scaredCount = 0;
    }

    @Override
    public void analyze(List<String> input) {
        for(String string : input){
            for(String sad : SAD){
                if(string.toLowerCase().contains(sad)){
                    setSadCount(getSadCount()+1);
                }
            }
            for(String angry : ANGRY){
                if(string.toLowerCase().contains(angry)){
                    setAngryCount(getAngryCount()+1);
                }
            }
            for(String happy : HAPPY){
                if(string.toLowerCase().contains(happy)){
                    setHappyCount(getHappyCount()+1);
                }
            }
            for(String scared : SCARED){
                if(string.toLowerCase().contains(scared)){
                    setScaredCount(getScaredCount()+1);
                }
            }
        }
    }

    @Override
    public void printResult() {
        System.out.println("Here are the results:");
        System.out.println("Sad: " + getSadCount());
        System.out.println("Angry: " + getAngryCount());
        System.out.println("Happy: " + getHappyCount());
        System.out.println("Scared: " + getScaredCount());
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getSadCount() {
        return sadCount;
    }

    public void setSadCount(int sadCount) {
        this.sadCount = sadCount;
    }

    public int getAngryCount() {
        return angryCount;
    }

    public void setAngryCount(int angryCount) {
        this.angryCount = angryCount;
    }

    public int getHappyCount() {
        return happyCount;
    }

    public void setHappyCount(int happyCount) {
        this.happyCount = happyCount;
    }

    public int getScaredCount() {
        return scaredCount;
    }

    public void setScaredCount(int scaredCount) {
        this.scaredCount = scaredCount;
    }
}
