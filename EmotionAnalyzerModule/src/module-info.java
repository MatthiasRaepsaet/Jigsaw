module EmotionAnalyzerModule {
    requires AnalyzerModule;
    provides analyzer.Analyzer with emotionanalyzer.EmotionAnalyzer;
}