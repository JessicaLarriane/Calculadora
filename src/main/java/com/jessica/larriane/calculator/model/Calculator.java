package com.jessica.larriane.calculator.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Calculator {

    @Getter @Setter
    private double value1;
    @Getter @Setter
    private double value2;

    public double addition(){
        return value1 + value2;
    }
    public double subtraction(){
        return value1 - value2;
    }
    public double multiplication(){
        return value1 * value2;
    }
    public double division(){
        return value1 / value2;
    }

}
