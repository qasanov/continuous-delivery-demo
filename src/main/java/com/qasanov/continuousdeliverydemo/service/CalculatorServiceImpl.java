package com.qasanov.continuousdeliverydemo.service;

import org.springframework.stereotype.Service;

/**
 * Calculator service interface implementation
 */
@Service
public class CalculatorServiceImpl implements CalculatorService{


    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
