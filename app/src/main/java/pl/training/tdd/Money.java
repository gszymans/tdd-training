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
        if(!this.getCurrency().equals(money.getCurrency())){
            throw new UnmatchetCurrencyException("Cannod add: " + this.getCurrency() + "with: " + money.getCurrency());
        }
        this.value = this.value + money.value;
        return this;
    }

    public Double getValue() {
        return this.value;
    }

    public Money convert(Money cashToConvert, Double exchangeRate) {
        var retObj = new Money(this.getCurrency());
        retObj.setValue(cashToConvert.getValue()/exchangeRate);
        return retObj;
    }

    public void setValue(Double value){
        this.value = value;
    }
}
