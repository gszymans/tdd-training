package pl.training.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void check_if_money_currency_is_usd() {
        Assertions.assertEquals(CurrencyType.USD, (new Money(CurrencyType.USD)).getCurrency());
    }

    @Test
    void add_some_money(){
        var cashInUsd = new Money(CurrencyType.USD);
        var cashInUsd2 = new Money(CurrencyType.USD);
        Assertions.assertEquals(Double.valueOf(22.22), cashInUsd.addMoney(cashInUsd2).getValue());
    }
}
