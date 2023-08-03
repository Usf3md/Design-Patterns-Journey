public class DirectionService {
    private TravelState travelState;

    public DirectionService(TravelState travelState) {
        this.travelState = travelState;
    }

    public int getEta() {
        return travelState.getEta();
    }

    public int getDirection() {
        return travelState.getDirection();
    }

    public TravelState getTravelState() {
        return travelState;
    }

    public void setTravelState(TravelState travelState) {
        this.travelState = travelState;
    }

}
