package PaymentStrategyDesign.ConcretePaymentClasses;

import PaymentStrategyDesign.PaymentStrategy;

public class CreditCard implements PaymentStrategy {

    public void makePayment(int amount) {
        System.out.println("Payment of $" + amount + " done using Credit Card\n");
    }
}
