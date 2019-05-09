package com.samokisha.calculatormateacademy.calculator;

public class DivideOperation implements Operation {

    private final String symbol = "/";

    @Override
    public Integer eval(Operand leftOperand, Operand rightOperand) {
        return leftOperand.getValue() / rightOperand.getValue();
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}
