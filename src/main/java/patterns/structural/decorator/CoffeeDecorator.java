package patterns.structural.decorator;

public abstract class CoffeeDecorator implements Coffee { // implementing Coffee is optional here
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee)  {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
