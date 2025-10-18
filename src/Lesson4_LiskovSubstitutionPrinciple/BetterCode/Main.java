package Lesson4_LiskovSubstitutionPrinciple.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Now with our new better code you do not have to make a list of all the Credit Cards,
        // Like :List<CreditCard> cards = new ArrayList<>();
       //Instead you just make a List of service specific Credit cards and any one of them will serve the purpose.
        List<InternationalPaymentCompatibleCreditCard> cards=new ArrayList<>();
        for (InternationalPaymentCompatibleCreditCard card: cards)
        {
            card.internationalPayment();
        }
    }
}

//Now above you see we do not have to do any specific handling since above Interface
//i.e., "InternationalPaymentCompatibleCreditCard" already knows that it will be
//implemented by only those classes which has International payment supported.

//So this module i.e., main compared to the "main" module of Problematic code has
// comparatively lesser tighter coupling.

//**Always try to build classes with less n less coupling cuz more the coupling, '
//more will be the violation of OCP and SRP. bcz everytime you have a new behaviour you
// are going to make changes to your main class.
