package Lesson3_LiskovSubstitutionPrinciple.ProblematicCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CreditCard> cards = new ArrayList<>();
        for (CreditCard card: cards)//here abstraction is being disobeyed,
            // like why should we go through just to check which ones
            // facilitate the upi service.
        {
            if (card instanceof RuPayCard)
            {
                card.upiPayment();
            }
        }
    }
}
