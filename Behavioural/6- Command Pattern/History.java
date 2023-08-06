import java.util.Deque;
import java.util.ArrayDeque;

public class History {
    Deque<UndoableCommand> commands = new ArrayDeque<>();

    void push(UndoableCommand command) {
        commands.push(command);
    }

    UndoableCommand pop() {
        return commands.pop();
    }
}
