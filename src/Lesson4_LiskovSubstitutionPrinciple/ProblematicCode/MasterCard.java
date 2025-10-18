package Lesson4_LiskovSubstitutionPrinciple.ProblematicCode;

public class MasterCard extends CreditCard{

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
    public void upiPayment() {
//        throw invalidMethodException something like that forcefully
//    since MasterCard does not support UPI payments.
    }

    @Override
    public void internationalPayments() {

    }
}


