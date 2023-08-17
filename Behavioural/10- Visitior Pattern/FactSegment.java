public class FactSegment extends Segment {
    @Override
    public void applyFilter(FilterVisitor filter) {
        filter.apply(this);
    }
}
