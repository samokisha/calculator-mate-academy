package com.samokisha.calculatormateacademy.calculator.operation;

import com.samokisha.calculatormateacademy.calculator.Operand;

public interface Operation {

    Integer eval(Operand leftOperand, Operand rightOperand);

    String getSymbol();

}
