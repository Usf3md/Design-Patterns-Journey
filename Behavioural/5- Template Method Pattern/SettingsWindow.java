public class SettingsWindow extends Window {

    @Override
    protected void beforeCloseTask() {
        System.out.println("Saving Settings...");
    }

}
