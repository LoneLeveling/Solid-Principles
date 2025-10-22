package Lesson3_LiskovSubstitutionPrinciple.BetterCode;

public class VisaCard extends CreditCard implements InternationalPaymentCompatibleCreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and pay implementation of VisaCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer imp of VisaCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay imp of VisaCard");
    }

    @Override
    public void mandatePayments()
    {
        System.out.println("Mandate payment imp of VisaCard");
    }

    @Override
    public void internationalPayment() {
        System.out.println("International Payment implementation of VisaCard");
    }

}
