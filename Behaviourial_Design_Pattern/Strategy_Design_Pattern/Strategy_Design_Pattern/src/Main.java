interface PaymentStrategy{

    public void makePayment();
}

class Crypto implements PaymentStrategy{

    public void makePayment(){

        System.out.println("Payment by crypto");
    }
}

class UPI implements PaymentStrategy{

    public void makePayment(){

        System.out.println("Payment by UPI");
    }
}

class NetBanking implements PaymentStrategy{

    public void makePayment(){

        System.out.println("Payment by NetBanking");
    }
}

class PaymentProcessor{

    private PaymentStrategy paymentStrategy;

    PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void makePayment(){
        paymentStrategy.makePayment();
    }
}


public class Main {
    public static void main(String[] args) {
        Crypto crypto=new Crypto();
        UPI upi=new UPI();
        NetBanking netBanking=new NetBanking();

        PaymentProcessor paymentProcessor=new PaymentProcessor(crypto);

        paymentProcessor.makePayment();
        paymentProcessor.setPaymentStrategy(upi);

        paymentProcessor.makePayment();
        paymentProcessor.setPaymentStrategy(netBanking);

        paymentProcessor.makePayment();
    }
}