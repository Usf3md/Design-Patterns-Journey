public class Main {
  public static void main(String[] args) {
    var factory = new CellFormatFactory();
    var sheet = new SpreadSheet(factory);
    sheet.setContent(0, 0, "Hello");
    sheet.setContent(1, 0, "World");
    sheet.setFontFamily(0, 0, "Arial");
    sheet.render();
  }
}
