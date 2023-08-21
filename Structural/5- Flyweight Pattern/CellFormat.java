import java.util.Objects;

public class CellFormat {
    private String fontFamily;
    private int fontSize;
    private boolean isBold;

    public CellFormat(String fontFamily, int fontSize, boolean isBold) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.isBold = isBold;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fontFamily, fontSize, isBold);
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public boolean isBold() {
        return isBold;
    }
}
