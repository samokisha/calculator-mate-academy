package com.samokisha.calculatormateacademy.calculator;

public interface Operation {

    String eval(Operand leftOperand, Operand rightOperand);

    String getSymbol();

}
