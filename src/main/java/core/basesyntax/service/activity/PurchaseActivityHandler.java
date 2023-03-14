package core.basesyntax.service.activity;

public class PurchaseActivityHandler implements ActivityHandler {
    @Override
    public Integer actionWithFruit(Integer amountOfFruit, Integer value) {
        return amountOfFruit - value;
    }
}
