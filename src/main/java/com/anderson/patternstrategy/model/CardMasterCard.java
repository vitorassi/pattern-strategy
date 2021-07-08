package com.anderson.patternstrategy.model;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class CardMasterCard extends Card implements FlagInterestCalculatorStrategyInterface{
    private BigDecimal ValuePercentage = new BigDecimal("4.00");
}