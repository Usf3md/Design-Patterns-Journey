import java.util.ArrayList;
import java.util.List;

public class Timeline {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void showTimeline() {
        for (Component component : components) {
            System.out.println(component.getClass().getName());
        }
    }
}
