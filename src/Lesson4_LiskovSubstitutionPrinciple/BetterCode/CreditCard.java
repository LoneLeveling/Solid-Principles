package Lesson4_LiskovSubstitutionPrinciple.BetterCode;

public abstract class CreditCard {

    private String ccNumber;
    private String ownerName;
    private int cvv;

    public void setCcNumber(String ccNumber)
    {
        this.ccNumber=ccNumber;
    }

    public void setOwnerName(String ownerName)
    {
        this.ownerName=ownerName;
    }

    public void setCvv(int cvv)
    {
        this.cvv=cvv;
    }

    public abstract void tapAndPay();

    public abstract void onlineTransfer();

    public abstract void swipeAndPay();

    public abstract void mandatePayments();
//Above we have created these 3 different types of abstract methods cuz we are going
// to support different kind of credit card payment networks like Visa,MasterCard and
// RuPay and each one of them could be implementing things in a certain way,
// For example how tap and pay works in Master card could be different from how it works
// in Visa, also we have to call a Master Card API for online transfer and for VisaCard
// we have to call a visa card API. so there will be  different i.e.., their own
// set of APIs that these different payment networks might support i.e., Master/RuPay,Visa.



    public void displayCreditCardDetails()
    {
        System.out.println("CC Number: "+ this.ccNumber +" , with Owner Name: "+ this.ownerName);
    }



}
