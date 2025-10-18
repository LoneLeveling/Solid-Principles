package Lesson4_LiskovSubstitutionPrinciple.BetterCode;

public class MasterCard extends CreditCard implements InternationalPaymentCompatibleCreditCard {

    @Override
    public void tapAndPay() {
        System.out.println("Tap and pay implementation of MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer imp of MasterCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay imp of MasterCard");
    }

    @Override
    public void mandatePayments()
    {
        System.out.println("Mandate payment imp of MasterCard");
    }


    @Override
    public void internationalPayment() {
        System.out.println("International Payment implementation of MasterCard");
    }
}


