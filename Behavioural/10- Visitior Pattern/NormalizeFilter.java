public class NormalizeFilter implements FilterVisitor {

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Normalize On Format Segment");
    }

    @Override
    public void apply(FactSegment segment) {
        System.out.println("Normalize On Fact Segment");
    }

}
