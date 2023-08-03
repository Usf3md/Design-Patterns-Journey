import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {
    private List<DocumentMemento> states = new ArrayList<>();

    public void push(DocumentMemento state) {
        states.add(state);
    }

    public DocumentMemento pop() {
        int lastIndex = states.size() - 1;
        DocumentMemento state = states.get(lastIndex);
        states.remove(state);
        return state;
    }
}
