/**
 * Created by Matthias on 27/05/2017.
 */
module MainModule {
    requires SplitterModule;
    uses splitter.Splitter;

    requires AnalyzerModule;
    uses analyzer.Analyzer;
}