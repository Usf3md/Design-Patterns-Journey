public class SetTextCommand extends AbstractUndoableCommand {
    String text;
    String prevText;

    public SetTextCommand(String text, History history, VideoEditor editor) {
        super(history, editor);
        this.text = text;
    }

    @Override
    protected void doExecute() {
        prevText = editor.getText();
        editor.setText(text);
    }

    @Override
    public void unexecute() {
        editor.setText(prevText);

    }

}
