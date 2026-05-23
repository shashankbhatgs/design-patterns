package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeSmartComponent implements SmartComponent{
    private final List<SmartComponent> components = new ArrayList<>();

    public void addComponents(SmartComponent component) {
        components.add(component);
    }

    public void removeComponents(SmartComponent component) {
        components.remove(component);
    }

    @Override
    public void turnOn() {
        for(SmartComponent component: components) {
            component.turnOn();
        }
    }

    @Override
    public void turnOff() {
        for(SmartComponent component: components) {
            component.turnOff();
        }
    }
}
