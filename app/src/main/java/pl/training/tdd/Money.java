package pl.training.tdd;

public class Money{

    private final CurrencyType currency;

    public Money(CurrencyType currency) {
        this.currency = currency;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public Money addMoney(Money money) {
        return null;
    }

    public Double getValue() {
        return null;
    }
}
