module TextSplitterModule {
    requires SplitterModule;
    provides splitter.Splitter
            with textsplitter.TextSplitter;
}