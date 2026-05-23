package patterns.structural.adapter;

public class SmartHomeController {
    public void controlDevice(String deviceType) {
        if( deviceType.equals("Airconditioner")) {
            // AC specific class and other stuff
            System.out.println("Connecting to air conditioner via bluetooth");
        }
        if( deviceType.equals("Smartlight")) {
            System.out.println("Connecting to smart light via wifi");
        }
        //....
        else {
            System.out.println("Device type not supported");
        }
    }
}
