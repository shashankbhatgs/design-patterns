package patterns.behaviour.strategy;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Paypal");
    }
}
