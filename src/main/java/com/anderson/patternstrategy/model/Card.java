package com.anderson.patternstrategy.model;

import java.math.BigDecimal;

public abstract class Card {

    public void calc(Payment payment) {
        payment.setValueInterest
                (payment.getValue()
                        .multiply(getValuePercentage())
                        .divide(new BigDecimal("100.00").setScale(2)));

    }

    protected abstract BigDecimal getValuePercentage();
}
