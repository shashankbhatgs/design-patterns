package patterns.structural.adapter;

public class AirConditioner {
    public void connectViaBluetooth() {
        System.out.println("connect via bluetooth");
    }

    public void startCooling() {
        System.out.println("start coooling");
    }

    public void stopCooling() {
        System.out.println("stop cooling");
    }
}
