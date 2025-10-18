package Lesson4_LiskovSubstitutionPrinciple.BetterCode;

public interface UpiCompatibleCreditCard {
    void upiPayment();
}


//So every class implementing this interface will have to implement this upiPayment() method.