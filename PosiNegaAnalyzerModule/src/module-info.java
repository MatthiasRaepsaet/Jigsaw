module PosiNegaAnalyzerModule {
    requires AnalyzerModule;
    requires junit;
    provides analyzer.Analyzer with posinegaanalyzer.PosiNegaAnalyzer;
}