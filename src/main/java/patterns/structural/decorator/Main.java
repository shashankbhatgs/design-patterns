package patterns.structural.decorator;

// Define a common interface for the base object and its decorators.
// Using decorators to wrap base objects, adding new behaviors while preserving the original object's interface
public class Main {
    public   static void main(String[] args) {
        Coffee coffee = new Espresso(); // Base coffee
        coffee = new MilkDecorator(coffee); //milk decorator
        coffee = new CreamDecorator(coffee); // cream decorator

        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total cost: " + coffee.getCost());
    }
}
