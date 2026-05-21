package patterns.creational.builder;

public class CarFactory {
    public static Car createSportsCar() {
        return new Car.CarBuilder().setEngine("V8").build();
    }

    public static Car createFamilyCar() {
        return new Car.CarBuilder().setEngine("V6").build();
    }
}
