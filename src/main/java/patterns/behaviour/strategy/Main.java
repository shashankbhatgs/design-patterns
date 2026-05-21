package patterns.behaviour.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy payPal = new PaypalPayment();

        PaymentProcessor processor = new PaymentProcessor(creditCard); // initially

        processor.processPayment();
        processor.setPaymentStrategy(payPal);
    }
}
