public class Emoji implements Element {
    private String emoji;

    public Emoji(String emoji) {
        this.emoji = emoji;
    }

    @Override
    public void addToBuilder(DocumentBuilder builder) {
        builder.addContent(this);
    }

    public String getContent() {
        return emoji;
    }

}
