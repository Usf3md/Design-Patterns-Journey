public class Image implements Element {
    private String source;

    public Image(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    @Override
    public void addToBuilder(DocumentBuilder builder) {
        builder.addContent(this);
    }
}
