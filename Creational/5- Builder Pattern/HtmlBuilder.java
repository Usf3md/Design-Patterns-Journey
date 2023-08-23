import html.HtmlDocument;
import html.HtmlIcon;
import html.HtmlImage;
import html.HtmlParagraph;

public class HtmlBuilder implements DocumentBuilder {

    private HtmlDocument document = new HtmlDocument();

    @Override
    public void addContent(Text text) {
        document.add(new HtmlParagraph(text.getContent()));
    }

    @Override
    public void addContent(Image img) {
        document.add(new HtmlImage(img.getSource()));
    }

    @Override
    public String getResult() {
        return document.toString();
    }

    @Override
    public void addContent(Emoji emoji) {
        document.add(new HtmlIcon(emoji.getContent()));
    }

}
