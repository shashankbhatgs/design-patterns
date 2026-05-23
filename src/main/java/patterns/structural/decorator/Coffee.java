package patterns.structural.decorator;

// common interface for all coffee types (base and decorators have to implement this)

public interface Coffee {
    String getDescription();
    double getCost();
}