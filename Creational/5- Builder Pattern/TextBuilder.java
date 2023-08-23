public class TextBuilder implements DocumentBuilder {
    private StringBuilder builder = new StringBuilder();

    @Override
    public void addContent(Text text) {
        builder.append(text.getContent());
    }

    @Override
    public void addContent(Image img) {
    }

    @Override
    public String getResult() {
        return builder.toString();
    }

    @Override
    public void addContent(Emoji emoji) {
        builder.append(emoji.getContent());
    }
}
