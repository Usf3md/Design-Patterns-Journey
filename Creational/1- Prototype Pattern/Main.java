public class Main {
    public static void main(String[] args) {
        Timeline timeline = new Timeline();
        ContextMenu contextMenu = new ContextMenu(timeline);
        Clip mainClip = new Clip();
        timeline.add(mainClip);
        contextMenu.duplicate(mainClip);
        timeline.showTimeline();
    }
}