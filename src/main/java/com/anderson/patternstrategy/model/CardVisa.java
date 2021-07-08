package com.anderson.patternstrategy.model;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class CardVisa extends Card implements FlagInterestCalculatorStrategyInterface {
    private BigDecimal ValuePercentage = new BigDecimal("3.00");
}