package com.anderson.patternstrategy.controller;

import com.anderson.patternstrategy.model.CalculatorPayment;
import com.anderson.patternstrategy.model.CardMasterCard;
import com.anderson.patternstrategy.model.CardVisa;
import com.anderson.patternstrategy.model.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ControllerPayment {

    @GetMapping("/payment/card-visa")
    public ResponseEntity payCardVisa(){

        CalculatorPayment calculatorPayment =
                CalculatorPayment.builder().calculatorStrategy(new CardVisa()).build();

             Payment payment = Payment.builder().value(new BigDecimal("1000.00")).build();

        calculatorPayment.calc(payment);

        return new ResponseEntity<>(payment, HttpStatus.OK);
    }

    @GetMapping("/payment/card-master")
    public ResponseEntity payCardMaster(){

        CalculatorPayment calculatorPayment =
                CalculatorPayment.builder().calculatorStrategy(new CardMasterCard()).build();

        Payment payment = Payment.builder().value(new BigDecimal("1000.00")).build();

        calculatorPayment.calc(payment);

        return new ResponseEntity<>(payment, HttpStatus.OK);
    }

}
