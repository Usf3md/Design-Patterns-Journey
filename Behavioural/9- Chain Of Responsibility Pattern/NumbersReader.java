public class NumbersReader extends Reader {

    public NumbersReader(Reader next) {
        super(next);
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a Numbers spreadsheet.");
    }

    @Override
    protected String getExtension() {
        return ".numbers";
    }
}
