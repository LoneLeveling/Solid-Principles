package Lesson4_LiskovSubstitutionPrinciple.BetterCode;


//Now all classes wanting to enable InternationalPayment service will implement this interface.
public interface InternationalPaymentCompatibleCreditCard
{
void internationalPayment();

}
