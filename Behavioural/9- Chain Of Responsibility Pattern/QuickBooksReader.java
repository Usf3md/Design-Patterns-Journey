public class QuickBooksReader extends Reader {

    public QuickBooksReader(Reader next) {
        super(next);
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a QuickBooks file.");
    }

    @Override
    protected String getExtension() {
        return ".qbw";
    }

}
