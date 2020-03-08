package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {
    CurrencyType type = CurrencyType.FRANC;


    @Override
    public CurrencyType getType() {
        return type;
    }
}
