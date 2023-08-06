public class Main {
    public static void main(String[] args) {
        History history = new History();
        VideoEditor editor = new VideoEditor();
        Command setTextCommand = new SetTextCommand("HELLO WORLD", history, editor);
        Command setContrastCommand = new SetContrastCommand(2, history, editor);
        Command undoCommand = new UndoCommand(history);

        setTextCommand.execute();
        setContrastCommand.execute();
        System.out.println(editor);
        setTextCommand = new SetTextCommand("HI WORLD", history, editor);
        setContrastCommand = new SetContrastCommand(3, history, editor);
        setTextCommand.execute();
        setContrastCommand.execute();
        undoCommand.execute();
        System.out.println(editor);

    }
}