package patterns.behaviour.strategy;

public class CreditCardPayment implements PaymentStrategy {
    public void processPayment() {
        System.out.println("Paypal");
    }
}

