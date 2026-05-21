package patterns.creational.builder;

public class Car2 {
    private int seats;
    private String engine;

    public Car2(Car2Builder builder) {
        this.seats = builder.seats;
        this.engine = builder.engine;
    }

    public String getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }


    public static class Car2Builder {
        private int seats = 1;
        private String engine;


        public Car2Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Car2Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Car2 build() {
            return new Car2(this);
        }
    }
}
