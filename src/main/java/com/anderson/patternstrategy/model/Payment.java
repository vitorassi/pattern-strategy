package com.anderson.patternstrategy.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Payment {
    private BigDecimal value;
    private BigDecimal valueInterest;

}
