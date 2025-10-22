package Lesson5_InterfaceSegregationPrinciple.BetterCode;

public class User implements ICanModifyProducts, ICanBuy, ICanSell{
    @Override
    public void buy() {

    }

    @Override
    public void modify() {

    }

    @Override
    public void sell() {

    }
}
