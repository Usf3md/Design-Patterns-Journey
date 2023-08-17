import java.util.ArrayList;
import java.util.List;

public class WavFile {
    private List<Segment> segments = new ArrayList<>();

    public void read(String fileName) {
        // Simulate reading a wav file and building the segments
        segments.add(new FormatSegment());
        segments.add(new FactSegment());
        segments.add(new FactSegment());
        segments.add(new FactSegment());
    }

    public void applyFilter(FilterVisitor filter) {
        for (var segment : segments)
            segment.applyFilter(filter);
        ;
    }
}
