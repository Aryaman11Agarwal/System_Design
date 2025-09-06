package PaymentStrategyDesign.ConcretePaymentClasses;

import PaymentStrategyDesign.PaymentStrategy;

public class Cash implements PaymentStrategy {

    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of $" + amount + " done using cash\n");
    }
}
