package Lesson3_LiskovSubstitutionPrinciple.BetterCode;

public class RuPayCard extends CreditCard implements UpiCompatibleCreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and pay implementation of RuPayCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer imp of RuPayCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay imp of RuPayCard");
    }

    @Override
    public void mandatePayments()
    {
        System.out.println("Mandate payment imp of RuPayCard");
    }


    @Override
    public void upiPayment() {
        System.out.println("UPI payment impl of RuPay");
    }
}
