package com.samokisha.calculatormateacademy.calculator;

import java.util.regex.Pattern;

public class Expression {

    private Operand leftOperand;
    private Operand rightOperand;
    private Operation operation;

    private Integer result;

    public Expression() {
    }

    public Expression(Operation operation, Operand leftOperand, Operand rightOperand) {
        this.operation = operation;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public static Expression parseExpression(String expression) throws Exception {
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

        return new Expression(operation, leftOperand, rightOperand);
    }

    public void performExpression() {
        result = operation.eval(leftOperand, rightOperand);
    }

    public Integer getResult() {
        return result;
    }
}
