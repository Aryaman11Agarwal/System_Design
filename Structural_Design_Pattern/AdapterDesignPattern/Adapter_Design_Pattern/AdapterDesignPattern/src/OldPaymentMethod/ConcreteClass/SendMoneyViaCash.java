package OldPaymentMethod.ConcreteClass;

import OldPaymentMethod.ISendMoney;

public class SendMoneyViaCash implements ISendMoney {

    public void sendMoney(int Ruppees){

        System.out.println("Sending money : "+ Ruppees + " by cash ");

    }
}
