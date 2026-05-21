package patterns.behaviour.strategy;

//public class PaymentProcessor {
//    public void processPayment(String paymentMethod) {
//        if (paymentMethod.equals("CreditCard")) {
//            System.out.println("Processing credit card payment");
//            //.....
//        } else if(paymentMethod.equals("Paypal")) {
//            System.out.println("Processing paypal payment...");
//            //.....
//        }else {
//            System.out.println("Payment method not supported");
//        }
//    }
//}

//public interface PaymentMethod {
//    void processPayment();
//}

//public class CreditCardPayment implements PaymentMethod {
//    public void processPayment() {
        // sout("")
//    }

// If else is not bloated, they have to call the method, but still we need to get rid of if-else
//

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment() {
        paymentStrategy.processPayment();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
