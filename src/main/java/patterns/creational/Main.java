package patterns.creational;


import patterns.creational.vehicles.Vehicle;
import patterns.creational.vehicles.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicle("Car");
        vehicle1.start();
        vehicle1.stop();
    }
}