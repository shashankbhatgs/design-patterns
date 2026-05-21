package patterns.behaviour.statedesign;

public class TrafficLightContext {
    private TrafficLightState currentState;
    public TrafficLightContext() {
        this.currentState = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public String getColor() {
        return currentState.getColor();
    }

    public void next(){
        currentState.next(this);
    }
}
