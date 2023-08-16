public abstract class Reader {
    private Reader next;

    public Reader(Reader next) {
        this.next = next;
    }

    public void read(String fileName) {
        if (fileName.endsWith(getExtension())) {
            doRead(fileName);
            return;
        }

        if (next != null)
            next.read(fileName);
        else
            throw new UnsupportedOperationException("File format not supported.");
    }

    protected abstract void doRead(String fileName);

    protected abstract String getExtension();
}
