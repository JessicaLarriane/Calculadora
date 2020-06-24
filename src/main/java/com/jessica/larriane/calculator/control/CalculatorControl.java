package com.jessica.larriane.calculator.control;

import com.jessica.larriane.calculator.model.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorControl {

    @GetMapping ("/")
    public String index(){
        return "Bem Vindo";
    }
    @GetMapping ("/operacoes")
    public String showOperations() {

        Calculator c1 = new Calculator();

        c1.setValue1(10);
        c1.setValue2(5);

        return "Valor 1: " + c1.getValue1() +
                "\nValor 2: " + c1.getValue2()+
                "\nAdição: " + c1.addition() +
                "\nSubtração: " + c1.subtraction() +
                "\nMultiplicação: " + c1.multiplication() +
                "\nDivisão: " + c1.division();
    }

}
