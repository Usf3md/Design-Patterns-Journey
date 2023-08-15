import java.util.ArrayList;
import java.util.List;

public class UIControl {
    protected List<EventHandler> eventHandlers = new ArrayList<>();

    protected void addEventHandler(EventHandler handler) {
        eventHandlers.add(handler);
    }

    protected void notifyEventHandlers() {
        for (EventHandler obs : eventHandlers) {
            obs.handle();
        }
    }

}
