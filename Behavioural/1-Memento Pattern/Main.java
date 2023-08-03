public class Main {
    public static void main(String[] args) {
        DocumentHistory history = new DocumentHistory();
        TextDocument doc = new TextDocument();

        doc.setContent("Hello");
        doc.setFontName("Sanserif");
        doc.setFontSize(10);
        history.push(doc.createMemento());
        doc.setContent("Hello 2");
        doc.setFontName("Sanserif 2");
        doc.setFontSize(20);
        history.push(doc.createMemento());
        doc.setContent("Hello 3");
        doc.setFontName("Sanserif 3");
        doc.setFontSize(30);
        history.push(doc.createMemento());
        doc.setContent("Hello 4");
        doc.setFontName("Sanserif 4");
        doc.setFontSize(40);
        System.out.println(doc);
        doc.restore(history.pop());
        System.out.println(doc);
        doc.restore(history.pop());
        System.out.println(doc);
        doc.restore(history.pop());
        System.out.println(doc);

    }
}