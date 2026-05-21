package patterns.behaviour.statedesign;

public class TrafficLight {
    private String color;
    public TrafficLight() {
        this.color = "RED";
    }

    public void next() {
        switch (color) {
            case "RED" -> {
                color = "GREEN";
                System.out.println("Light RED -> GREEN");
            }
            case "GREEN" -> {
                color = "YELLOW";
                System.out.println("Light GREEN -> YELLOW");
            }
            case "YELLOW" -> {
                color = "RED";
                System.out.println("Light YELLOW -> RED");
            }
        }
    }

    public String getColor() {
        return color;
    }
}
