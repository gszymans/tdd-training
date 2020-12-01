package pl.training.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoneyTest {

    @Test
    void check_if_money_has_currency() {
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

    @Test
    void convert_money_to_another_money_with_exchange_rate(){
        var cashInPln = new Money(CurrencyType.PLN);
        var cashInUsd = new Money(CurrencyType.USD, Double.valueOf(44.44));
        Assertions.assertEquals(Double.valueOf(11.11), cashInPln.convert(cashInUsd, Double.valueOf(4.0)).getValue());
    }

    @Test
    void add_some_money_in_different_currency(){
        var cashInPln = new Money(CurrencyType.PLN);
        var cashInUsd = new Money(CurrencyType.USD, Double.valueOf(44.44));
        Assertions.assertEquals(Double.valueOf(11.11), cashInPln.addMoney(cashInUsd, Double.valueOf(4.0)).getValue());
    }
}
