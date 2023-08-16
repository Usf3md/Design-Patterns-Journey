public class DataReader {
    private Reader handler;

    public DataReader(Reader handler) {
        this.handler = handler;
    }

    public void read(String fileName) {
        handler.read(fileName);
    }
}
