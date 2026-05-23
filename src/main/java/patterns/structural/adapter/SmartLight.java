package patterns.structural.adapter;

public class SmartLight {

    public void connectViaBluetooth() {
        System.out.println("connect via bluetooth");
    }

    public void connetToWifi() {
        System.out.println("connected to wifi");
    }

}
