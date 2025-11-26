import NewPaymentProcessor.ConcretePaymentClass.PaymentAdapter;
import OldPaymentMethod.ConcreteClass.SendMoneyViaCash;
import OldPaymentMethod.ConcreteClass.SendMoneyViaUPI;
import OldPaymentMethod.ISendMoney;

public class Main {
    public static void main(String[] args) {

        ISendMoney sendMoneyViaCash=new SendMoneyViaCash();
        ISendMoney sendMoneyViaUPI=new SendMoneyViaUPI();

        PaymentAdapter paymentAdapter=new PaymentAdapter(sendMoneyViaCash);
        paymentAdapter.makePayment(100);



        PaymentAdapter paymentAdapter2=new PaymentAdapter(sendMoneyViaUPI);
        paymentAdapter2.makePayment(100);


    }
}