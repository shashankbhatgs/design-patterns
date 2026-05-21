package patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
//        Car.CarBuilder builder = new Car.CarBuilder();
//        Car car1 = builder
//                .setSeats(10)
//                .setSunroof(true)
//                .build(); // The build method returns the final product
//
//        System.out.println(car1.getSeats());

        Car2.Car2Builder builder = new Car2.Car2Builder();
        Car2 car2 = builder.setSeats(2).build();

//        Car sportsCar = CarFactory.createSportsCar();
    }
}
