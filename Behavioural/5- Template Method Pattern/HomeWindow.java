public class HomeWindow extends Window {

    @Override
    protected void beforeCloseTask() {
        System.out.println("Logging Out...");
    }

    @Override
    protected void afterCloseTask() {
        super.afterCloseTask();
        System.out.println("Clearing Cookies...");
    }

}
