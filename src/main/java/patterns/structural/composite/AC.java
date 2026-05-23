package patterns.structural.composite;

public class AC implements SmartComponent{
    @Override
    public void turnOn() {
        System.out.println("Ac on");
    }

    @Override
    public void turnOff() {
        System.out.println("AC off");
    }
}
