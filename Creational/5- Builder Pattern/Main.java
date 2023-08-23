import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var document = new Document();
        document.add(new Text("Hello World"));
        document.add(new Image("pic1.jpg"));
        document.add(new Emoji("😂"));

        document.export(new HtmlBuilder(), "export.html");

        // Only writes the text elements to the file
        document.export(new TextBuilder(), "export.txt");
    }
}
