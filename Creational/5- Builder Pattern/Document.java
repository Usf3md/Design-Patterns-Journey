import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void export(DocumentBuilder format, String fileName) throws IOException {
        for (Element element : elements) {
            element.addToBuilder(format);
        }

        var writer = new FileWriter(fileName);
        writer.write(format.getResult());
        writer.close();
    }
}
