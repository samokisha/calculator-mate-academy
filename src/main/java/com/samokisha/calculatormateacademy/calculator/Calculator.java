package com.samokisha.calculatormateacademy.calculator;

public class Calculator {

    private String task;
    private String result;
    private Expression expression;

    public void performTask() {
        expression = new Expression();
        expression.parseExpression(task);
        expression.performExpression();
        result = String.valueOf(expression.getResult());
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
