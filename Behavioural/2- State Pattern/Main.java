public class Main {
    public static void main(String[] args) {
        DirectionService ds = new DirectionService(new Transit());
        ds.getEta();
        ds.setTravelState(new Bicycling());
        ds.getEta();
        ds.setTravelState(new Driving());
        ds.getEta();
        ds.setTravelState(new Walking());
        ds.getEta();
    }
}