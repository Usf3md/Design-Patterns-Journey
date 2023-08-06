public abstract class AbstractUndoableCommand implements UndoableCommand {
    History history;
    VideoEditor editor;

    public AbstractUndoableCommand(History history, VideoEditor editor) {
        this.history = history;
        this.editor = editor;
    }

    public void execute() {
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
