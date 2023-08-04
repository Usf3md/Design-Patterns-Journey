public abstract class Window {
    public void close() {
        beforeCloseTask();
        System.out.println("Removing the window from the screen");
        afterCloseTask();
    }

    protected abstract void beforeCloseTask();

    // Hook Method
    protected void afterCloseTask() {
        System.out.println("Clearing Cache...");
    };
}
