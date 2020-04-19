package com.qasanov.continuousdeliverydemo.web;

import com.qasanov.continuousdeliverydemo.service.CalculatorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private  CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping("/sum")
    public Integer sum(@RequestParam("a") Integer a,  @RequestParam("b") Integer b) {
        return calculatorService.add(a, b);
    }



}
