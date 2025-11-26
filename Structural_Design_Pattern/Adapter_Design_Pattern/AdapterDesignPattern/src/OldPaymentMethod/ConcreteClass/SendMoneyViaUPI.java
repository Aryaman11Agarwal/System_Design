package OldPaymentMethod.ConcreteClass;

import OldPaymentMethod.ISendMoney;

public class SendMoneyViaUPI implements ISendMoney {

    @Override
    public void sendMoney(int Ruppees) {
        System.out.println("Sending money : "+ Ruppees + " by UPI ");
    }
}
