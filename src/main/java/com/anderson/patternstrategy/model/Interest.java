package com.anderson.patternstrategy.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
@Builder
@Data
public class Interest {
    private BigDecimal value;
    private TypeInterestEnum typeInterestEnum;
}
