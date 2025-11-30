package NewPaymentProcessor.ConcretePaymentClass;

import NewPaymentProcessor.IPaymentProcessor;

import OldPaymentMethod.ISendMoney;

public class PaymentAdapter implements IPaymentProcessor {
    ISendMoney iSendMoney;

    public PaymentAdapter(ISendMoney iSendMoney){
        this.iSendMoney=iSendMoney;
    }

    @Override
    public void makePayment(int ruppees) {
       iSendMoney.sendMoney(ruppees);
    }
}
