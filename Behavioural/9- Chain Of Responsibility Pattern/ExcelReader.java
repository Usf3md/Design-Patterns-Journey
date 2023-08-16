public class ExcelReader extends Reader {

    public ExcelReader(Reader next) {
        super(next);
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from an Excel spreadsheet.");
    }

    @Override
    protected String getExtension() {
        return ".xls";
    }

}
