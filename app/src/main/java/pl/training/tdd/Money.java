package pl.training.tdd;

public class Money{

    private final CurrencyType currency;

    public Money(CurrencyType currency) {
        this.currency = currency;
    }

    public CurrencyType getCurrency() {
        return currency;
    }
}
