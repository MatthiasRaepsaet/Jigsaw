package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import posinegaanalyzer.PosiNegaAnalyzer;

import java.util.ArrayList;
import java.util.List;

public class PosiNegaTest {

    PosiNegaAnalyzer posiNegaAnalyzer = new PosiNegaAnalyzer();

    List<String> testList;

    @Before
    public void setup(){
        testList = new ArrayList<>();
    }

    @After
    public void cleanUp(){
        testList.clear();
    }

    @Test
    public void analyzeEmpty(){
        posiNegaAnalyzer.analyze(testList);
        Assert.assertEquals("Postive should be 0", 0, posiNegaAnalyzer.getPositive());
        Assert.assertEquals("Negative should be 0", 0, posiNegaAnalyzer.getNegative());
    }

    @Test
    public void analyzeCharacter(){
        testList.add("a");
        posiNegaAnalyzer.analyze(testList);
        Assert.assertEquals("Postive should be 0", 0, posiNegaAnalyzer.getPositive());
        Assert.assertEquals("Negative should be 0", 0, posiNegaAnalyzer.getNegative());
    }

    @Test
    public void analyzeSpace(){
        testList.add(" ");
        posiNegaAnalyzer.analyze(testList);
        Assert.assertEquals("Postive should be 0", 0, posiNegaAnalyzer.getPositive());
        Assert.assertEquals("Negative should be 0", 0, posiNegaAnalyzer.getNegative());
    }

    @Test
    public void analyzeInteger(){
        testList.add("5555 6666 7777");
        posiNegaAnalyzer.analyze(testList);
        Assert.assertEquals("Postive should be 0", 0, posiNegaAnalyzer.getPositive());
        Assert.assertEquals("Negative should be 0", 0, posiNegaAnalyzer.getNegative());
    }

    @Test
    public void analyzeSpecialCharacter(){
        testList.add("? !!!! @@");
        posiNegaAnalyzer.analyze(testList);
        Assert.assertEquals("Postive should be 0", 0, posiNegaAnalyzer.getPositive());
        Assert.assertEquals("Negative should be 0", 0, posiNegaAnalyzer.getNegative());
    }
}
