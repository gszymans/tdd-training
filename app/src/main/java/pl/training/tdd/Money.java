package pl.training.tdd;

public class Money {

    private final CurrencyType currency;
    private Double value = Double.valueOf(0);

    public Money(CurrencyType currency) {
        this.currency = currency;
    }

    public Money(CurrencyType currency, Double value) {
        this.currency = currency;
        this.value = value;
    }

    public CurrencyType getCurrency() {
        return this.currency;
    }

    public Money addMoney(Money money) {
        this.value = this.value + money.value;
        return this;
    }

    public Double getValue() {
        return this.value;
    }

}
