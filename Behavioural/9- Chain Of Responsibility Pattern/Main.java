public class Main {
    public static void main(String[] args) {
        QuickBooksReader quickBooksHandler = new QuickBooksReader(null);
        NumbersReader numbersHandler = new NumbersReader(quickBooksHandler);
        ExcelReader excelHandler = new ExcelReader(numbersHandler);

        DataReader reader = new DataReader(excelHandler);
        reader.read("Document.xls");
        reader.read("Document.numbers");
        reader.read("Document.qbw");
        // reader.read("Document.docx");
    }
}