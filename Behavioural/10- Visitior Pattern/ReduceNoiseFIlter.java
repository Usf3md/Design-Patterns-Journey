public class ReduceNoiseFIlter implements FilterVisitor {

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Noise Reduction On Format Segment");
    }

    @Override
    public void apply(FactSegment segment) {
        System.out.println("Noise Reduction On Fact Segment");
    }

}
