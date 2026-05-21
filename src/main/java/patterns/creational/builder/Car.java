package patterns.creational.builder;

//Builder pattern -> setting is done in the builder class
// getting is done in the main class

public class Car {
    private final String engine;
    private final int wheels;
    private final int seats;
    private final String color;
    private final boolean sunroof;
    private final boolean navigationSystem;

    //    No one calls this class since it's private
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
        this.navigationSystem = builder.navigationSystem;
    }


    //Getter methods for the fields
    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public boolean getSunroof() {
        return sunroof;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }


    public static class CarBuilder {
        private String engine;
        private int wheels = 4;
        private int seats = 5;
        private boolean sunroof = false;
        private String color = "Blue";
        private boolean navigationSystem = false;


        // setter methods for the fields.
        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }


        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder setNavigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Car build() {
            return new Car(this); // Return a new Car created using the builders
        }

    }
}
