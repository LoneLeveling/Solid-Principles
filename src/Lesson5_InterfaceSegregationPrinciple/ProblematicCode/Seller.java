package Lesson5_InterfaceSegregationPrinciple.ProblematicCode;

public class Seller implements User {
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    //below we know seller cannot approve products still we are forced to implement that behaviour.
    @Override
    public boolean canApproveProducts() {
        return false;
    }

    @Override
    public boolean canSellProducts() {
        return false;
    }

    @Override
    public void approveProduct() {

    }
}
