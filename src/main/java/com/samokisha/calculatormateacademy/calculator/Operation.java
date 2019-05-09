package com.samokisha.calculatormateacademy.calculator;

public interface Operation {

    Integer eval(Operand leftOperand, Operand rightOperand);

    String getSymbol();

}
