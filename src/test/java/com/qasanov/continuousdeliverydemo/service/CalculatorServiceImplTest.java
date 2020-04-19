package com.qasanov.continuousdeliverydemo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {


    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void sumTwoIntegers() {
        int sum = calculatorService.add(2, 3);
        assertEquals(5,sum);
    }

    @Test
    void wrongResult() {
        int sum = calculatorService.add(2, 3);
        assertNotEquals(4,sum);
    }

    @Test
    void zeroSum() {
        int sum = calculatorService.add(0, 0);
        assertEquals(0,sum);
    }
}