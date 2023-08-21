import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellFormatFactory {
    private Map<Integer, CellFormat> formats;

    public CellFormatFactory() {
        this.formats = new HashMap<>();
    }

    public CellFormat getFormat(String fontFamily, int fontSize, boolean isBold) {
        int hash = Objects.hash(fontFamily, fontSize, isBold);
        if (!formats.containsKey(hash)) {
            formats.put(hash, new CellFormat(fontFamily, fontSize, isBold));
        }
        return formats.get(hash);
    }
}
