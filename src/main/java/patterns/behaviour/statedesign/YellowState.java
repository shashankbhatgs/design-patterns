package patterns.behaviour.statedesign;

public class YellowState implements TrafficLightState{
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from YELLOW -> RED");
        context.setState(new RedState());
    }

    @Override
    public String getColor() {
        return "YELLOW";
    }
}
