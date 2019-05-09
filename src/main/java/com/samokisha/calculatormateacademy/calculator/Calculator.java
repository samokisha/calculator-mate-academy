package com.samokisha.calculatormateacademy.calculator;

public class Calculator {

    private String task;
    private Integer result;
    private Expression expression;

    public void performTask() throws Exception {
        expression = Expression.parseExpression(task);
        expression.performExpression();
        result = expression.getResult();
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Integer getResult() {
        return result;
    }
}
