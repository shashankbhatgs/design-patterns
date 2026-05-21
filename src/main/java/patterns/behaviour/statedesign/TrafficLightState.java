package patterns.behaviour.statedesign;

public interface TrafficLightState {
    void next(TrafficLightContext context);
    String getColor();
}
