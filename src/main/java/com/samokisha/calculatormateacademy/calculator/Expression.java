package com.samokisha.calculatormateacademy.calculator;

public class Expression {

    private Operand leftOperand;
    private Operand rightOperand;
    private Operation operation;

    private Integer result;

    public void parseExpression(String task) {
        if (task.contains("+")) {
            operation = new PlusOperation();
        } else if (task.contains("-")) {
            operation = new MinusOperation();
        } else if (task.contains("*")) {
            operation = new MultiplyOperation();
        } else if (task.contains("/")) {
            operation = new DivideOperation();
        }

        String[] operands = task.split(operation.getSymbol());
        leftOperand = new Operand(operands[0]);
        rightOperand = new Operand(operands[1]);
    }

    public void performExpression() {
        result = operation.eval(leftOperand, rightOperand);
    }

    public Integer getResult() {
        return result;
    }
}
