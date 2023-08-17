public class UnsupportedHandler extends Handler {

    public UnsupportedHandler(Handler next) {
        super(next);
    }

    @Override
    protected Boolean doHandle(String fileName) {
        System.out.println("File format not supported.");
        return true;
    }

}
