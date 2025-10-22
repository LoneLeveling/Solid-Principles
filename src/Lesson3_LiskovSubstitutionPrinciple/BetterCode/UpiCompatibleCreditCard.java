package Lesson3_LiskovSubstitutionPrinciple.BetterCode;
//Now all classes wanting to enable UPI service will implement this interface.

public interface UpiCompatibleCreditCard {
    void upiPayment();
}


//So every class implementing this interface will have to implement this upiPayment() method.