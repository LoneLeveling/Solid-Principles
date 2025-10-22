package Lesson3_LiskovSubstitutionPrinciple.ProblematicCode;

public class VisaCard extends CreditCard{
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
    public void upiPayment() {
//        throw invalidMethodException something like that forcefully
//    since VisCard does not support UPI payments.
    }

    @Override
    public void internationalPayments() {

    }
}
