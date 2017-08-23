module SentenceSplitterModule {
    requires SplitterModule;
    provides splitter.Splitter
            with sentencesplitter.SentenceSplitter;
}