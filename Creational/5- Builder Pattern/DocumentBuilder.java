public interface DocumentBuilder {
    void addContent(Text text);

    void addContent(Image img);

    void addContent(Emoji emoji);

    String getResult();

}
