public class SetContrastCommand extends AbstractUndoableCommand {

    private float constrast;
    private float prevConstrast;

    public SetContrastCommand(float contrast, History history, VideoEditor editor) {
        super(history, editor);
        this.constrast = contrast;
    }

    @Override
    protected void doExecute() {
        prevConstrast = editor.getContrast();
        editor.setContrast(constrast);

    }

    @Override
    public void unexecute() {
        editor.setContrast(prevConstrast);

    }

}
