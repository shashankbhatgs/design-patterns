package patterns.creational.vehicles;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        return switch (vehicleType) {
            case "Car" -> new Car();
            case "Truck" -> new Truck();
            case "Bike" -> new Bike();
            default -> throw new IllegalArgumentException("Unknown vehicle type");
        };
    }
}
