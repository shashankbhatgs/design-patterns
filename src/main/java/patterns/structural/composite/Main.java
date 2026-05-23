package patterns.structural.composite;

// Handling hierarchy -> All components have to be treated equally like implement a single interface
public class Main {
    public static void main(String[] args) {
        SmartComponent ac = new AC();
        SmartComponent smartLight = new SmartLight();

        SmartComponent ac2 = new AC();
        SmartComponent smartLight2 = new SmartLight();

        CompositeSmartComponent room1  = new CompositeSmartComponent();
        room1.addComponents(ac);
        room1.addComponents(smartLight);

        CompositeSmartComponent room2 = new CompositeSmartComponent();
        room2.addComponents(ac2);
        room2.addComponents(smartLight2);

        CompositeSmartComponent floor = new CompositeSmartComponent();
        floor.addComponents(room1);
        floor.addComponents(room2);

        floor.turnOn();
    }
}
