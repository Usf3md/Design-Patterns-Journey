public interface FilterVisitor {
    void apply(FormatSegment segment);

    void apply(FactSegment segment);
}