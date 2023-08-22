import java.util.Date;

public class ArabianCalendar implements Calendar {

    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Adding an event on the given date with Arabian Calendar.");
    }

}
