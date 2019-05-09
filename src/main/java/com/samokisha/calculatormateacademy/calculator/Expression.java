package com.samokisha.calculatormateacademy.calculator;

import com.samokisha.calculatormateacademy.calculator.operation.*;

import java.util.regex.Pattern;

public class Expression {

    private Operand leftOperand;
    private Operand rightOperand;
    private Operation operation;

    private NumberType numberType;

    private Integer result;

    public Expression() {
    }

    public Expression(Operation operation, Operand leftOperand, Operand rightOperand) {
        this.operation = operation;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;

        this.numberType = leftOperand.getNumberType();
    }

    public static Expression parseExpression(String expression) throws Exception {
        validateStringExpression(expression);

        expression = expression.replaceAll(" ", "");

        Operand leftOperand;
        Operand rightOperand;
        Operation operation;

        if (expression.contains("+")) {
            operation = new PlusOperation();
        } else if (expression.contains("-")) {
            operation = new MinusOperation();
        } else if (expression.contains("*")) {
            operation = new MultiplyOperation();
        } else if (expression.contains("/")) {
            operation = new DivideOperation();
        } else {
            throw new Exception("Operation is not support. Expression: " + expression);
        }

        String[] operands = expression.split(Pattern.quote(operation.getSymbol()));
        leftOperand = new Operand(operands[0]);
        rightOperand = new Operand(operands[1]);

        if (leftOperand.getNumberType() != rightOperand.getNumberType()) {
            throw new Exception("Operands type mismatch. It must be the same type.");
        }

        return new Expression(operation, leftOperand, rightOperand);
    }

    private static void validateStringExpression(String expr) throws Exception {
        if (expr.contains(".") || expr.contains(",")) {
            throw new Exception("Calculator work only with integers!");
        }
    }

    public void performExpression() {
        result = operation.eval(leftOperand, rightOperand);
    }

    public Integer getResult() {
        return result;
    }

    public NumberType getNumberType() {
        return numberType;
    }
}
