package main;

import analyzer.Analyzer;
import splitter.Splitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ServiceLoader;

/**
 * Created by Matthias on 27/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        Iterable<Splitter> splitters = ServiceLoader.load(Splitter.class);
        int counter = 1;
        List<Splitter> splitterList = new ArrayList<>();
        for(Splitter splitter : splitters){
            splitterList.add(splitter);
            System.out.println(counter + ": " + splitter.getSplitterName());
            counter++;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of the splitter you want to use: ");
        Splitter selectedSplitter = splitterList.get(Integer.parseInt(input.nextLine())-1);
        System.out.println("You chose the: " + selectedSplitter.getSplitterName());
        System.out.println("Please give the text/sentence you want to have analyzed: ");
        List<String> outputList = selectedSplitter.split(input.nextLine());

        Iterable<Analyzer> analyzers = ServiceLoader.load(Analyzer.class);
        counter = 1;
        List<Analyzer> analyzerList = new ArrayList<>();
        for(Analyzer analyzer : analyzers){
            analyzerList.add(analyzer);
            System.out.println(counter + ": " + analyzer.getName());
            counter++;
        }
        System.out.println("Please enter the number of the analyzer you want to use: ");
        Analyzer selectedAnalyzer = analyzerList.get(Integer.parseInt(input.nextLine())-1);
        System.out.println("You chose the: " + selectedAnalyzer.getName());
        selectedAnalyzer.analyze(outputList);
        selectedAnalyzer.printResult();
    }
}
