package pl.training.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoneyTest {

    @Test
    void check_if_money_currency_is_usd() {
        Assertions.assertEquals(CurrencyType.USD, (new Money(CurrencyType.USD)).getCurrency());
    }

    @Test
    void add_some_money_in_the_same_currency(){
        var cashInUsd = new Money(CurrencyType.USD);
        var cashInUsd2 = new Money(CurrencyType.USD, Double.valueOf(22.22));
        Assertions.assertEquals(Double.valueOf(22.22), cashInUsd.addMoney(cashInUsd2).getValue());
    }

    @Test
    void try_to_add_some_money_in_different_currency_and_expect_exception(){
        var cashInPln = new Money(CurrencyType.PLN);
        var cashInUsd = new Money(CurrencyType.USD);
        assertThrows(UnmatchetCurrencyException.class, () -> cashInPln.addMoney(cashInUsd));
    }
}
