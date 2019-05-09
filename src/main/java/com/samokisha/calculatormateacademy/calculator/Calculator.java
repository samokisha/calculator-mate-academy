package com.samokisha.calculatormateacademy.calculator;

public class Calculator {

    private String task;
    private Expression expression;
    private Integer result;
    private String stringResult;

    public void performTask() throws Exception {
        expression = Expression.parseExpression(task);
        expression.performExpression();
        result = expression.getResult();

        switch (expression.getNumberType()) {
            case ARABIC:
                stringResult = String.valueOf(result);
                break;
            case ROMAN:
                stringResult = Utils.arabicToRoman(result);
        }
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

    public String getStringResult() {
        return stringResult;
    }
}
