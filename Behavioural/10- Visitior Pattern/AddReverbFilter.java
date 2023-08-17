public class AddReverbFilter implements FilterVisitor {

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Add Reverb On Format Segment");
    }

    @Override
    public void apply(FactSegment segment) {
        System.out.println("Add Reverb On Fact Segment");
    }

}
