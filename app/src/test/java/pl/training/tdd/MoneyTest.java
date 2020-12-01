package pl.training.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {



    @Test
    void check_if_money_currency_is_usd(){
        Assertions.assertEquals(CurrencyType.USD, (new Money()).getCurrency());
    }
}
