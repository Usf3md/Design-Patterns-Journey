package html;

public class HtmlIcon extends HtmlElement {
    private String icon;

    public HtmlIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return String.format("<i>%s</i>", icon);
    }
}
