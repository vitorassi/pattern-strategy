package com.anderson.patternstrategy.model;

import lombok.Builder;

@Builder
public class CalculatorPayment {

    private FlagInterestCalculatorStrategyInterface calculatorStrategy;

    public void calc(Payment payment){
        this.calculatorStrategy.calc(payment);
    }
}
