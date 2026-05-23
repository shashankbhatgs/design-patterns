package patterns.structural.composite;

public class SmartLight implements SmartComponent {
    @Override
    public void turnOn() {
        System.out.println("Light on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light off");
    }
}
